package com.codein.service;

import com.codein.entities.Peranan;

public interface PerananService{
	public Iterable<Peranan> findAll();
	
	public Peranan find(int id);
	
	public void save(Peranan account);
	
	public void delete(Peranan account);
}
