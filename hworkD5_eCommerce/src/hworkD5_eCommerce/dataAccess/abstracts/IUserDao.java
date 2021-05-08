package hworkD5_eCommerce.dataAccess.abstracts;

import hworkD5_eCommerce.entities.concretes.User;

public interface IUserDao {
	
	void add(User user);
	boolean emailCheck(User user);
	boolean loginByCheck(String email, String password);
	

}
