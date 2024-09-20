package com.upoint.model.integration.product;


import org.springframework.boot.autoconfigure.domain.EntityScan;
<<<<<<< HEAD
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
<<<<<<< HEAD

import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;

@ComponentScan(basePackages =  {"com.upoint.model.product", "com.upoint.model.util"})
@EntityScan("com.upoint.model.product")
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
@PropertySource("classpath:qa-config/qa-upoint_product.properties")
public class CategoryModelIntegrationTest extends BaseCategoryModelTest{
=======
import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;



@PropertySource("classpath:qa-config/qa-upoint_product.properties")
@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
@EntityScan("com.upoint.model.product")
@ComponentScan(  basePackages = {"com.upoint.model.product", "com.upoint.model.util"})
public class CategoryModelIntegrationTest extends BaseCategoryModelTest {
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

}
