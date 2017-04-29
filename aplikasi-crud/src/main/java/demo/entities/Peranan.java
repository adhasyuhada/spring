package demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Peranan {
	
	@Id
	@Column(name = "peranan_id")
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	private String nama_peranan;
	
	private String description;
	
	@Column(nullable = false)
	private Date date;
	
	private UserPeranan user;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama_peranan() {
		return nama_peranan;
	}

	public void setNama_peranan(String nama_peranan) {
		this.nama_peranan = nama_peranan;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	@OneToOne
	@JoinColumn(name = "user_id")
	public UserPeranan getUser(){
		return user;
	}
	
	public void setUser(UserPeranan user){
		this.user = user;
	}
	
	
}
