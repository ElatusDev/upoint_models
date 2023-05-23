package com.upoint.model.inventory;

import java.time.LocalDateTime;
import java.util.List;

import com.upoint.model.hr.Employee;
import com.upoint.model.product.Product;
import com.upoint.model.user.User;
import com.upoint.model.util.Image;

public class ReceivingOrder {
	
	private Long id;
	private LocalDateTime dateTime;
	private Employee employee;
	private List <OnStockProduct> receivingProducts;
	private List<Product> expectedProducts;
	private Image orderImage;
	
}
