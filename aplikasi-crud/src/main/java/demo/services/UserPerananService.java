package demo.services;

import demo.model.UserPeranan;

public interface UserPerananService {
	Iterable<UserPeranan> listAllUserPeranan();
	UserPeranan getUserPerananById(Integer id);
	UserPeranan saveUserPeranan(UserPeranan userPeranan);
	void deleteUserPeranan(Integer id);
}
