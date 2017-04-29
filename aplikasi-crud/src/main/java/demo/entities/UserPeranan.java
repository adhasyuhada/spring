package demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_peranan")
public class UserPeranan {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	private String nama;
	
	@Column(nullable = false)
	private String jabatan;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String nama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getJabatan(){
		return jabatan;
	}
	
	public void setJabatan(String jabatan){
		this.jabatan = jabatan;
	}
	
}
