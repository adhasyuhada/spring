package com.codein.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "peranan", catalog = "demo")
public class Peranan implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String peran;
	private String description;
	
	public Peranan(){
	}
	
	public Peranan(String username, String peran, String description){
		this.username = username;
		this.peran = peran;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "username", nullable = false)
	public String getUsername() {
		return this.username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "peran", nullable = false, length = 250)
	public String getPeran() {
		return this.peran;
	}
	public void setPeran(String peran) {
		this.peran = peran;
	}
	
	@Column(name = "description", nullable = false, length = 250)
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
