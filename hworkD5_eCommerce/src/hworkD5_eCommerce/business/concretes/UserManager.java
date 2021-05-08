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
			System.out.println("Kayýt baþarýsýz."+ user.getEmail() + " email adresi zaten kullanýlýyor; " + "\n Email adresi size aitse lütfen giriþ yapýnýz.");				
		}		
		else if (!personInformationValid.isValid(user)) {
			System.out.println("Kayýt baþarýsýz. Kullanýcý bilgileri kullanýlamaz, lütfen kurallara uyunuz.");
			}
		else {
			confirmService.sendVarificationMail();
			userdao.add(user);
			
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(userdao.loginByCheck(email, password)) {
			System.out.println(email + " ile griþ baþarýlý..");
		}else {
			System.out.println("Giriþ baþarýsýz. Lütfen mail ve þifrenizi doðru girdiðinizden emin olun.");
		}
		
	}

}
