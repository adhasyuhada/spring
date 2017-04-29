package demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import demo.dao.PerananRepositories;
import demo.entities.Peranan;

public class PerananServiceImpl implements PerananService{
	
	private PerananRepositories perananRepositories;
	
	@Autowired 
	public void setPeranan(PerananRepositories perananRepositories){
		this.perananRepositories = perananRepositories;
	}
	
	@Override
	public Iterable<Peranan> listAllPeranan() {
		return perananRepositories.findAll();
	}

	@Override
	public Peranan getPerananById(Integer id) {
		return perananRepositories.findOne(id);
	}

	@Override
	public Peranan savePeranan(Peranan peranan) {
		return perananRepositories.save(peranan);
	}

	@Override
	public void deletePeranan(Integer id) {
		perananRepositories.delete(id);
	}

}
