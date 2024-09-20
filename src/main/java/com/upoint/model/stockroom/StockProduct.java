package com.upoint.model.stockroom;


<<<<<<< HEAD
import jakarta.persistence.Column;
=======
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

<<<<<<< HEAD
@Table(name = "stockroom_stock_product")
public class StockProduct {

=======
@Scope
@Component
@Entity
@Table(name = "stockroom_stock_product")
public class StockProduct {
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_product_id")
	private Long id;
<<<<<<< HEAD
	
	@Column(name = "stock_product_id")
	private Long product;
	
=======

	@Column(name = "stock_product_id")
	private Long product;
	
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@Column(name = "stock_product_code", nullable = false, length = 16)
	private String code;

}
