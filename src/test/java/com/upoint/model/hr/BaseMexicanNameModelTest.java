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

public class BaseMexicanNameModelTest {
	
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
