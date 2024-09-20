package com.upoint.model.unit.stockroom;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

<<<<<<< HEAD
@ComponentScan(basePackages =  {"com.upoint.model.stockroom", "com.upoint.model.util"})
@EntityScan(basePackages = {"com.upoint.model.stockroom", "com.upoint.model.room"})
@DataJpaTest
@PropertySource("classpath:dev-config/dev-upoint_stockroom.properties")
public class StockroomModelTest {
=======
@DataJpaTest
@EntityScan(basePackages = {"com.upoint.model.stockroom",  "com.upoint.model.room" })
@PropertySource("classpath:dev-config/dev-upoint_stockroom.properties")
@ComponentScan(  basePackages = {"com.upoint.model.stockroom", "com.upoint.model.util",})
public class StockroomModelTest {
	
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

}
