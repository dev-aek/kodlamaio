package homeworkD3;

public class UserManager {
	
	public void signIn (User user) {
		System.out.println("" + user.getUserName()+ "kullan�c� giri�i ba�ar�l�. Ana sayfaya y�nlendiriliyorsunuz...");
	}

	public void register (User user, String massage) {
		User users= new User(user.getId(), user.getFullName(), user.getPassword(), user.getUserName(), user.getEmail());
		
		System.out.println(massage + " " + users.getFullName());
		}
	
	public void getInformation(User user) {
		
		System.out.println(
				"Kullan�c� Ad� "+ user.getUserName()+"\n "				
				+"��renci Soyad�:"+user.getFullName()+"\n "
				+"�ifre:"+user.getPassword()+"\n "
				+"E mail adresi:"+user.getEmail()+"\n ");		
	}
	
}
