package com.upoint.model.hr.unit;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import com.upoint.model.hr.BaseMexicanNameModelTest;
import com.upoint.model.testapp.TestApplication;


@ComponentScan(basePackages = {"com.upoint.model.hr"})
@EntityScan(basePackages = {"com.upoint.model.hr"})
@PropertySource("classpath:dev-config/dev-upoint_hr.properties")
@DataJpaTest
@ContextConfiguration(classes = TestApplication.class)
public class MexicanNameModelTest extends BaseMexicanNameModelTest {

}
