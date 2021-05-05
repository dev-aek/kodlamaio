package homeworkD4_2;

public class UserManager implements IUserService {

	MernisManager mernisManager;
	
	public UserManager(MernisManager mernisManager) {
		this.mernisManager = mernisManager;
	}

	@Override
	public void addUser(User user) {
		
		if (mernisManager.MernisManager(user) == true) {
			System.out.println("Kayýt baþarýlý " + user.getFirstName() + " "+ user.getLastName() + ", hoþgeldin.");
			
		}else {
			System.out.println("Bilgiler doðru deðil! Kayýt baþarýsýz, lütfen tekrar deneyin.");
		}
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() + ", bilgileriniz güncellendi" );
		
	}

	@Override
	public void deleteUser(User user) {
		
		System.out.println(user.getFirstName() + " "+ user.getLastName() + ", hesabýnýz silindi. Bu iþlem tekrar alýnamaz." );
		
	}

}
