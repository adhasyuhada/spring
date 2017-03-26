package com.codein.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codein.domain.Product;;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
}
