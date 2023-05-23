package com.upoint.model.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@DataJpaTest
@EntityScan("com.upoint.model.product")
@ContextConfiguration(classes = {Category.class})
public class CategoryModelTest {
	
	@Autowired
	private EntityManagerFactory factory;
	
	@Autowired
	private ApplicationContext context;
	private EntityManager manager;
	private Category category;
	
	@BeforeEach
	void setup() {
		manager = factory.createEntityManager();
		category = context.getBean(Category.class);
	}
	
	void givenEntityIsRegistered_whenEvalContains_thenResultTrue() {
		//Category class should have @Entity annotation
		
		final boolean result = manager.contains(category);
		
		
		Assertions.assertTrue(result);
				
	}
		
}
