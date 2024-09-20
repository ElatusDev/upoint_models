package com.upoint.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "user_role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "role_id")
	private Long id;
	
	@Column(name = "role_name", nullable = false, length = 30)
	private String name;
	
	@Column(name = "role_write_acces", nullable = false)
	private Boolean writeAccess;
	
	@Column(name = "role_read_acces", nullable = false)
	private Boolean readAccess;
	
	@Column(name = "role_modify_acces", nullable = false)
	private Boolean modifyAcces;
	
	@Column(name = "role_delete_acces", nullable = false)
	private Boolean deleteAcces;

}
