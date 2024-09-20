package com.upoint.model.integration.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
<<<<<<< HEAD

import com.upoint.model.product.Product;
import com.upoint.model.util.MsgError;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@ComponentScan(basePackages =  {"com.upoint.model.product", "com.upoint.model.util","com.upoint.model.testapp"})
@EntityScan("com.upoint.model.product")
@DataJpaTest
@PropertySource("classpath:qa-config/qa-upoint_product.properties")
=======
import com.upoint.model.product.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@DataJpaTest
@EntityScan("com.upoint.model.product")
@PropertySource("classpath:qa-config/qa-upoint_product.properties")
@ComponentScan(  basePackages = {"com.upoint.model.product", "com.upoint.model.util", "com.upoint.model.testapp"})
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
public class ProductModelTest {

	@Autowired
	private EntityManagerFactory factory;
	
	@Autowired
	private ApplicationContext context;
	
<<<<<<< HEAD
	@Autowired
	private MsgError msgError;
	
=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private EntityManager manager;
	
	private Product product;
}
<<<<<<< HEAD

=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
