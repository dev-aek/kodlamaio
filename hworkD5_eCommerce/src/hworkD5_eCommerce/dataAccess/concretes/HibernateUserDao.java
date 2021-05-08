package hworkD5_eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import hworkD5_eCommerce.dataAccess.abstracts.IUserDao;
import hworkD5_eCommerce.entities.concretes.User;

public class HibernateUserDao implements IUserDao{
	
	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý kayýdý tamamlandý. Hoþgeldiniz " + user.getFirstName() + " "+ user.getLastName());
	}

	@Override
	public boolean emailCheck(User user) {
		for (User person : users) 
			if (person.getEmail() == user.getEmail()) {
				return false;
			}				
		return true;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for (User user : users) {
            if (user.getEmail() == email && user.getPassword() == password)
             return true;
             }
			 return false;
			 }

}
