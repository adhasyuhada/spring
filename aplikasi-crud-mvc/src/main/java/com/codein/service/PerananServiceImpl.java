package com.codein.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codein.dao.PerananDAO;
import com.codein.entities.Peranan;

@Service("accountService")
@Transactional
public class PerananServiceImpl implements PerananService{

	@Autowired private PerananDAO perananDAO;
	
	@Override
	public Iterable<Peranan> findAll() {
		return perananDAO.findAll();
	}

	@Override
	public Peranan find(int id) {
		return perananDAO.findOne(id);
	}

	@Override
	public void save(Peranan peranan) {
		perananDAO.save(peranan);
	}

	@Override
	public void delete(Peranan peranan) {
		perananDAO.delete(peranan);
		
	}

}
