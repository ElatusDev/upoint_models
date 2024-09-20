package com.upoint.model.product;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

<<<<<<< HEAD
@Scope("prototype")
@Component
@Entity 
@Table(name = "product_category") 
public class Category {
	
=======

@Scope("prototype")
@Component
@Entity
@Table(name = "product_category")
public class Category {
	
	
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer id;
	
	@Column(name = "category_name", nullable = false, length = 25)
	private String name;
	
	@Column(name = "category_description", nullable = false, length = 300)
	private String description;
	
<<<<<<< HEAD
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_category_id", nullable = true)
	private List <Category> children;

=======
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_category_id", nullable = true)
	private List <Category> children;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Category> getChildren() {
		return children;
	}
	public void setChildren(List<Category> children) {
		this.children = children;
	}
	
	
	

}
