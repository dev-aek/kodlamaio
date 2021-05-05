package homeworkD4_2;

public class UserManager implements IUserService {

	MernisManager mernisManager;
	
	public UserManager(MernisManager mernisManager) {
		this.mernisManager = mernisManager;
	}

	@Override
	public void addUser(User user) {
		
		if (mernisManager.MernisManager(user) == true) {
			System.out.println("Kay�t ba�ar�l� " + user.getFirstName() + " "+ user.getLastName() + ", ho�geldin.");
			
		}else {
			System.out.println("Bilgiler do�ru de�il! Kay�t ba�ar�s�z, l�tfen tekrar deneyin.");
		}
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() + ", bilgileriniz g�ncellendi" );
		
	}

	@Override
	public void deleteUser(User user) {
		
		System.out.println(user.getFirstName() + " "+ user.getLastName() + ", hesab�n�z silindi. Bu i�lem tekrar al�namaz." );
		
	}

}
