package com.upoint.model.unit.stockroom;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@DataJpaTest
@EntityScan(basePackages = {"com.upoint.model.stockroom",  "com.upoint.model.room" })
@PropertySource("classpath:dev-config/dev-upoint_stockroom.properties")
@ComponentScan(  basePackages = {"com.upoint.model.stockroom", "com.upoint.model.util",})
public class StockroomModelTest {
	
	

}
