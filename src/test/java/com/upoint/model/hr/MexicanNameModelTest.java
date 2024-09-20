package com.upoint.model.hr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

import com.upoint.model.hr.mx.MexicanName;
import com.upoint.model.testapp.TestApplication;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

@ComponentScan(basePackages = {"com.upoint.model.hr"})
@EntityScan(basePackages = {"com.upoint.model.hr"})
@DataJpaTest
@PropertySource("classpath:dev-config/dev-upoint_hr.properties")
@ContextConfiguration(classes = TestApplication.class)
public class MexicanNameModelTest {
	
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
	
		
	
	
}
