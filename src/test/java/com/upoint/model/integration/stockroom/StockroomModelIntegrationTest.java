package com.upoint.model.integration.stockroom;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.upoint.model.stockroom.Stockroom;
import com.upoint.model.testapp.TestApplication;
import com.upoint.model.stockroom.ReceivingOrder;


@ComponentScan(basePackages =  {"com.upoint.model.stockroom", "com.upoint.model.util"})
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
@PropertySource("classpath:qa-config/qa-upoint_stockroom.properties")
public class StockroomModelIntegrationTest {
	
	@Autowired
	private MongoTemplate template;
	
	private ReceivingOrder receivingOrder;
	
	@BeforeEach
	public void setup() {
		
		receivingOrder = new ReceivingOrder();
		
		receivingOrder.setDateTime(LocalDateTime.now());
		receivingOrder.setEmployee("1");	
	}
	
	//@Test
	@Transactional
	public void givenStockroomIsValid_whenPersisting_thenShouldReturnId() {
		
		Stockroom stockroom = new Stockroom();
		
		List<ReceivingOrder> list = new ArrayList<>();
		list.add(receivingOrder);
		stockroom.setReceivingOrders(list);
		
		
		template.insert(stockroom);

		
		Assertions.assertAll(
			() -> Assertions.assertNotNull(stockroom.getId()),
			() -> Assertions.assertNotNull(stockroom.getReceivingOrders().get(0).getId())
		);
		
		
	}
	
}
