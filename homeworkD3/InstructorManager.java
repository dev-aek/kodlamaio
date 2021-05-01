package homeworkD3;

public class InstructorManager extends UserManager {
	
	
public void getInformation(Instructor user) {	
		System.out.println(
			
				"Kullanýcý Adý "+ user.getUserName()+"\n "				
				+"Öðrenci Soyadý:"+user.getFullName()+"\n "
				+"Þifre:"+user.getPassword()+"\n "
				+"E mail adresi:"+user.getEmail()+"\n "
				+"Toplam öðrenci sayýsý" + user.haveTotalMembers + "\n"
				+"Sahip olduðu eðitimler" + user.haveToTraining);		
}

public void addCourse (String course) {
	
	System.out.println("Yeni kurs eklendi. Kurs ismi: " +course );	
}


}
