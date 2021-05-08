package hworkD5_eCommerce.business.concretes;

import hworkD5_eCommerce.business.abstracts.IUserServise;
import hworkD5_eCommerce.core.IConfirmatoryService;
import hworkD5_eCommerce.core.IVerificationService;
import hworkD5_eCommerce.dataAccess.abstracts.IUserDao;
import hworkD5_eCommerce.entities.concretes.User;

public class UserManager implements IUserServise {

	IVerificationService personInformationValid;
	IUserDao userdao;
	IConfirmatoryService confirmService;
	
	
	public UserManager(IVerificationService personInformationValid, IUserDao userdao,
			IConfirmatoryService confirmService) {
		super();
		this.personInformationValid = personInformationValid;
		this.userdao = userdao;
		this.confirmService = confirmService;
	}

	@Override
	public void register(User user) {
		if (!userdao.emailCheck(user)) {
			System.out.println("Kay�t ba�ar�s�z."+ user.getEmail() + " email adresi zaten kullan�l�yor; " + "\n Email adresi size aitse l�tfen giri� yap�n�z.");				
		}		
		else if (!personInformationValid.isValid(user)) {
			System.out.println("Kay�t ba�ar�s�z. Kullan�c� bilgileri kullan�lamaz, l�tfen kurallara uyunuz.");
			}
		else {
			confirmService.sendVarificationMail();
			userdao.add(user);
			
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(userdao.loginByCheck(email, password)) {
			System.out.println(email + " ile gri� ba�ar�l�..");
		}else {
			System.out.println("Giri� ba�ar�s�z. L�tfen mail ve �ifrenizi do�ru girdi�inizden emin olun.");
		}
		
	}

}
