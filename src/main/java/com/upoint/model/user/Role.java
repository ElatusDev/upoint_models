package com.upoint.model.user;

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
@Table (name = "user_role")
public class Role {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Long id;
	
	@Column(name = "role_name", nullable = false, length = 14)
	private String name;
	
	
	@Column(name = "role_write_receiving_order_access", nullable = false)
	private Boolean writeReceivingOrderAccess;
	
	
	@Column(name = "role_read_receiving_order_access", nullable = false)
	private Boolean readReceivingOrderAccess;
	
	
	
}
