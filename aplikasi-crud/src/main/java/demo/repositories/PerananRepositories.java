package demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.entities.Peranan;

@Repository
public interface PerananRepositories extends CrudRepository<Peranan, Integer>{
	
}
