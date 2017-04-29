package com.codein.service;

import com.codein.entities.Account;

public interface AccountService{
	public Iterable<Account> findAll();
	
	public Account find(int id);
	
	public void save(Account account);
	
	public void delete(Account account);
}
