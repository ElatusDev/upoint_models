package com.upoint.model.stockroom;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import com.upoint.model.util.Image;

@Document(collection = "receivingOrder")
@Component
public class ReceivingOrder {
	
	@Id
	private String id;

	private LocalDateTime dateTime;
	private String employee;
	private List <StockProduct> receivingProducts;
	private List<String> expectedProducts;
	private List<Image> orderImages;

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

}
