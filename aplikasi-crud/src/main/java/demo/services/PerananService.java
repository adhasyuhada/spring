package demo.services;

import demo.model.Peranan;

public interface PerananService{
	
	Iterable<Peranan> listAllPeranan();
	
	Peranan getPerananById(Integer id);
	
	Peranan savePeranan(Peranan peranan);
	
	void deletePeranan(Integer id);

}
