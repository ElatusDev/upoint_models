package com.upoint.model.integration.product;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

import com.upoint.model.product.BaseCategoryModelTest;
import com.upoint.model.testapp.TestApplication;

@ComponentScan(basePackages =  {"com.upoint.model.product", "com.upoint.model.util"})
@EntityScan("com.upoint.model.product")
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
@PropertySource("classpath:qa-config/qa-upoint_product.properties")
public class CategoryModelIntegrationTest extends BaseCategoryModelTest{

}
