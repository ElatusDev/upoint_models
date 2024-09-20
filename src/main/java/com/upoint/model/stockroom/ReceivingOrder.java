package com.upoint.model.stockroom;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import com.upoint.model.util.Image;

<<<<<<< HEAD
@Document(collection = "receivingOrder")
@Component
=======

@Component
@Document(collection = "receivingOrder")
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
public class ReceivingOrder {
	
	@Id
	private String id;
	
	
	private LocalDateTime dateTime;
	
	
	private String employee;
	
	
	private List <StockProduct> receivingProducts;
	
	
<<<<<<< HEAD
	private List<String> expectedProducts;
	
	
	private List<Image> orderImages;
=======
	private List <String> expectedProducts;
	
	
	private List <Image> orderImages;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public LocalDateTime getDateTime() {
		return dateTime;
	}


	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}


	public String getEmployee() {
		return employee;
	}


	public void setEmployee(String employee) {
		this.employee = employee;
	}


	public List<StockProduct> getReceivingProducts() {
		return receivingProducts;
	}


	public void setReceivingProducts(List<StockProduct> receivingProducts) {
		this.receivingProducts = receivingProducts;
	}


	public List<String> getExpectedProducts() {
		return expectedProducts;
	}


	public void setExpectedProducts(List<String> expectedProducts) {
		this.expectedProducts = expectedProducts;
	}


	public List<Image> getOrderImages() {
		return orderImages;
	}


	public void setOrderImages(List<Image> orderImages) {
		this.orderImages = orderImages;
	}
	
	
<<<<<<< HEAD
=======
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
