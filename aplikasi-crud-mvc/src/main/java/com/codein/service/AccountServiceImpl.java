package com.codein.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codein.dao.AccountDAO;
import com.codein.entities.Account;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired private AccountDAO accountDAO;
	
	@Override
	public Iterable<Account> findAll() {
		return accountDAO.findAll();
	}

	@Override
	public Account find(int id) {
		return accountDAO.findOne(id);
	}

	@Override
	public void save(Account account) {
		accountDAO.save(account);
	}

	@Override
	public void delete(Account account) {
		accountDAO.delete(account);
		
	}

}
