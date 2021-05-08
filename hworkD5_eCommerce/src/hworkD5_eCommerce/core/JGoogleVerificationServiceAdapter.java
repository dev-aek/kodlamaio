package hworkD5_eCommerce.core;

import hworkD5_eCommerce.entities.concretes.User;
import hworkD5_eCommerce.jGoogleValid.JGoogleVerificationService;

public class JGoogleVerificationServiceAdapter implements IVerificationService {

	@Override
	public boolean isValid(User user) {
		 JGoogleVerificationService googleUserValid = new  JGoogleVerificationService();		 
		return googleUserValid.isValid();
	}
	

}
