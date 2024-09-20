package com.upoint.model.integration.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.upoint.model.product.Product;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@ComponentScan(basePackages =  {"com.upoint.model.product", "com.upoint.model.util","com.upoint.model.testapp"})
@EntityScan("com.upoint.model.product")
@DataJpaTest
@PropertySource("classpath:qa-config/qa-upoint_product.properties")
public class ProductModelTest {

	@Autowired
	private EntityManagerFactory factory;
	
	@Autowired
	private ApplicationContext context;
	
	
	
	private EntityManager manager;
	
	private Product product;
}

