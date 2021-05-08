package hworkD5_eCommerce.business.abstracts;

import hworkD5_eCommerce.entities.concretes.User;

public interface IUserServise {
	void register(User user);
	void login(String email, String password);

}
