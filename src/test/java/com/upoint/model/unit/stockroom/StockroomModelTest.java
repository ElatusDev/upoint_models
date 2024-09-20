package com.upoint.model.unit.stockroom;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages =  {"com.upoint.model.stockroom", "com.upoint.model.util"})
@EntityScan(basePackages = {"com.upoint.model.stockroom", "com.upoint.model.room"})
@DataJpaTest
@PropertySource("classpath:dev-config/dev-upoint_stockroom.properties")
public class StockroomModelTest {

}
