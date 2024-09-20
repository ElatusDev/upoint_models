package com.upoint.model.product;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import com.upoint.model.util.MsgError;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;



public abstract class BaseCategoryModelTest {
	@Autowired
	private EntityManagerFactory factory;
	
	@Autowired
	private ApplicationContext context;

	@Autowired
	private MsgError msgError;
	
	private EntityManager manager;
	

	private Category category;
	
	@BeforeEach
	public void setup() {
		manager = factory.createEntityManager();
		category = context.getBean(Category.class);
		category.setId(null);
		category.setName("category root");
		category.setDescription("description test");
		Category child = context.getBean(Category.class);
		child.setId(null);
		child.setName("first child");
		child.setDescription("child description");
		List<Category> children = new ArrayList<>();
		children.add(child);
		category.setChildren(children);
	}
	
	private void executeTransaction(EntityManager manager, Category category) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(category);
		for(Category child: category.getChildren()) {
			manager.persist(child);
		}
		transaction.commit();
		
	}
	
	@Test
	public void givenCategoryIsValid_whenPersisting_thenReturnId() {
		//Category class should have @Entity annotation
		
		
		executeTransaction(manager, category);
		Assertions.assertNotNull(category.getId());
	}
	
	@Test
	public void givenIdIsInvalid_whenPersisting_thenShouldThrowEx() {
		category.setId(1);
		PersistenceException ex =  Assertions.assertThrows(PersistenceException.class, ()->{
			executeTransaction(manager, category);
		});
		
		Assertions.assertEquals(msgError.getInvalidIdErr(Category.class.getName()), ex.getCause().getMessage());
		
	}
}


