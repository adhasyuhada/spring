package demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import demo.model.UserPeranan;
import demo.repositories.UserPerananRepositories;

public class UserPerananServiceImpl implements UserPerananService{
	
	private UserPerananRepositories userPerananRepositories;
	
	@Autowired
	public void setUserPeranan(UserPerananRepositories userPerananRepositories){
		this.userPerananRepositories = userPerananRepositories;
	}
	
	@Override
	public Iterable<UserPeranan> listAllUserPeranan() {
		
		return userPerananRepositories.findAll();
	}

	@Override
	public UserPeranan getUserPerananById(Integer id) {
		return userPerananRepositories.findOne(id);
	}

	@Override
	public UserPeranan saveUserPeranan(UserPeranan userPeranan) {
		return userPerananRepositories.save(userPeranan);
	}

	@Override
	public void deleteUserPeranan(Integer id) {
		userPerananRepositories.delete(id);		
	}

}
