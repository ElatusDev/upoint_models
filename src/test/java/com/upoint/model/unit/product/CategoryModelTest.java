package com.upoint.model.unit.product;

import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

@ComponentScan(basePackages =  {"com.upoint.model.product", "com.upoint.model.util"})
@EntityScan("com.upoint.model.product")
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
@PropertySource("classpath:dev-config/dev-upoint_product.properties")
public class CategoryModelTest extends BaseCategoryModelTest {
 
	
}