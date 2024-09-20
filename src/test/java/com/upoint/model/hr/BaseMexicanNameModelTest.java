package com.upoint.model.hr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import com.upoint.model.hr.mx.MexicanName;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

<<<<<<< HEAD


public abstract class BaseMexicanNameModelTest {

=======
public class BaseMexicanNameModelTest {
>>>>>>> 4123f36a8f5e01256fc0a3003e4aec9b028c7495
	
	@Autowired
	private EntityManagerFactory factory;
	
	private EntityManager manager;
	
	private MexicanName mexicanName;
	
	@Autowired
	private ApplicationContext context;
	
	@BeforeEach
	void init() {
		manager = factory.createEntityManager();
		mexicanName = context.getBean(MexicanName.class);
		mexicanName.setFirstName("name test");
		mexicanName.setLastName("last name test");
		mexicanName.setSecondName("second name test");
		mexicanName.setSecondLastName("second last name tes");
		mexicanName.setId(null);
	}
	
<<<<<<< HEAD
	private void executeTransaction(EntityManager manager, MexicanName mexicanName) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(mexicanName);
		transaction.commit();
		
		
	}
	@Test
	void givenMexicanNameIsValid_whenPersisting_ThenReturnId() {
		
		
		Integer expectedId = 1;
		
		executeTransaction(manager, mexicanName);
		
		Assertions.assertEquals(expectedId, mexicanName.getId());
	}
=======
	private void executeTransaction() {
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		manager.persist(mexicanName);
		transaction.commit();
	}
	@Test
	void givenMexicanNameIsValid_whenPersisting_thenReturnId() {
		//init method provides valid object
		Integer expectedId = 1;
		executeTransaction();
		Assertions.assertEquals(expectedId, mexicanName.getId());;
	}
	
		
	
	
>>>>>>> 4123f36a8f5e01256fc0a3003e4aec9b028c7495
}
