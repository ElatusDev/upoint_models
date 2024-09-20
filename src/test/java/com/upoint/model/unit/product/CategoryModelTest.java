package com.upoint.model.unit.product;

import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
@EntityScan("com.upoint.model.product")
@ComponentScan(  basePackages = {"com.upoint.model.product", "com.upoint.model.util"})
@PropertySource("classpath:dev-config/dev-upoint_product.properties")
public class CategoryModelTest  extends BaseCategoryModelTest {
	
}