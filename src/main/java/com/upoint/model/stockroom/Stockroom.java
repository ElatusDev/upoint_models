package com.upoint.model.stockroom;

import java.util.List;
<<<<<<< HEAD
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.upoint.model.room.Room;

=======

import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import com.upoint.model.room.Room;

@Scope
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
@Component
@Document(collection = "stockroom")
public class Stockroom extends Room {
	
	@Id
	private String id;
	
	private List<ReceivingOrder> receivingOrders;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ReceivingOrder> getReceivingOrders() {
		return receivingOrders;
	}

	public void setReceivingOrders(List<ReceivingOrder> receivingOrders) {
		this.receivingOrders = receivingOrders;
	}
	
	
<<<<<<< HEAD
	
	
=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

}
