package com.codein.dao;

import org.springframework.data.repository.CrudRepository;
import com.codein.entities.Account;

public interface AccountDAO extends CrudRepository<Account, Integer >{

}
