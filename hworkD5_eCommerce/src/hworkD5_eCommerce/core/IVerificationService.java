package hworkD5_eCommerce.core;

import hworkD5_eCommerce.entities.concretes.User;

public interface IVerificationService {
	boolean isValid(User user);

}
