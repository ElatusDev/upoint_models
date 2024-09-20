package com.upoint.model.stockroom;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Scope
@Component
@Entity
@Table(name = "stockroom_stock_product")
public class StockProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_product_id")
	private Long id;

	@Column(name = "stock_product_id")
	private Long product;
	
	@Column(name = "stock_product_code", nullable = false, length = 16)
	private String code;

}
