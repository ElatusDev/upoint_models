package com.upoint.model.stockroom;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import com.upoint.model.room.Room;

@Scope
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
	
	

}
