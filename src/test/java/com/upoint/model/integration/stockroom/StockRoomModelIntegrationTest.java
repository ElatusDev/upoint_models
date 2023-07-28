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
import com.upoint.model.stockroom.ReceivingOrder;
import com.upoint.model.testapp.TestApplication;

import com.upoint.model.stockroom.Stockroom;


@PropertySource("classpath:qa-config/qa-upoint_stockroom.properties")
@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
@ComponentScan(  basePackages = {"com.upoint.model.stockroom", "com.upoint.model.util"})
public class StockRoomModelIntegrationTest {

	@Autowired
	private MongoTemplate template;
	
	private ReceivingOrder receivingOrder;
	
	@BeforeEach
	public void setUp() {
		receivingOrder = new ReceivingOrder();
		receivingOrder.setDateTime(LocalDateTime.now());
		receivingOrder.setEmployee("1");
	}
	
	@Transactional
	@Test
	public void givenStockroomIsValid_whenPersisting_thenShouldreturnId() {
		
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
