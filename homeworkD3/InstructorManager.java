package homeworkD3;

public class InstructorManager extends UserManager {
	
	
public void getInformation(Instructor user) {	
		System.out.println(
			
				"Kullan�c� Ad� "+ user.getUserName()+"\n "				
				+"��renci Soyad�:"+user.getFullName()+"\n "
				+"�ifre:"+user.getPassword()+"\n "
				+"E mail adresi:"+user.getEmail()+"\n "
				+"Toplam ��renci say�s�" + user.haveTotalMembers + "\n"
				+"Sahip oldu�u e�itimler" + user.haveToTraining);		
}

public void addCourse (String course) {
	
	System.out.println("Yeni kurs eklendi. Kurs ismi: " +course );	
}


}
