package demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.model.Peranan;

@Repository
public interface PerananRepositories extends CrudRepository<Peranan, Integer>{
	
}
