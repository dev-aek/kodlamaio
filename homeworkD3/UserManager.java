package homeworkD3;

public class UserManager {
	
	public void signIn (User user) {
		System.out.println("" + user.getUserName()+ "kullanýcý giriþi baþarýlý. Ana sayfaya yönlendiriliyorsunuz...");
	}

	public void register (User user, String massage) {
		User users= new User(user.getId(), user.getFullName(), user.getPassword(), user.getUserName(), user.getEmail());
		
		System.out.println(massage + " " + users.getFullName());
		}
	
	public void getInformation(User user) {
		
		System.out.println(
				"Kullanýcý Adý "+ user.getUserName()+"\n "				
				+"Öðrenci Soyadý:"+user.getFullName()+"\n "
				+"Þifre:"+user.getPassword()+"\n "
				+"E mail adresi:"+user.getEmail()+"\n ");		
	}
	
}
