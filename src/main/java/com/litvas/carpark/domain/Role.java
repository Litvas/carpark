package com.litvas.carpark.domain;

import javax.persistence.*;

@Entity
@Table
public class Role {

	@Id
	@Column(name="role_id")
	private int id;

	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
