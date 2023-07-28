package com.upoint.model.integration.product;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;



@PropertySource("classpath:qa-config/qa-upoint_product.properties")
@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
@EntityScan("com.upoint.model.product")
@ComponentScan(  basePackages = {"com.upoint.model.product", "com.upoint.model.util"})
public class CategoryModelIntegrationTest extends BaseCategoryModelTest {

}
