package com.upoint.model.product;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;



@ComponentScan("com.upoint.model.product")
@EntityScan("com.upoint.model.product")
@DataJpaTest
@PropertySource("classpath:test.properties")
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
	@Test
	void givenEntityIsRegistered_whenEvalContains_thenResultTrue() {
		//Category class should have @Entity annotation
		
		final boolean result = manager.contains(category);
		
		Assertions.assertTrue(result);
	}
}
