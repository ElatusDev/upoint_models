package com.upoint.model.unit.product;

<<<<<<< HEAD
import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;
=======


>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

<<<<<<< HEAD
@ComponentScan(basePackages =  {"com.upoint.model.product", "com.upoint.model.util"})
@EntityScan("com.upoint.model.product")
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
@PropertySource("classpath:dev-config/dev-upoint_product.properties")
public class CategoryModelTest extends BaseCategoryModelTest {
 
	
}
=======
import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;



@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
@EntityScan("com.upoint.model.product")
@ComponentScan(  basePackages = {"com.upoint.model.product", "com.upoint.model.util"})
@PropertySource("classpath:dev-config/dev-upoint_product.properties")
public class CategoryModelTest  extends BaseCategoryModelTest {
	
}

	
	
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
