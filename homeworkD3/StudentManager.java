package homeworkD3;

public class StudentManager extends UserManager {
	
public void joinToCourse(String course) {
	
	System.out.println(course + " kursuna katıldınız. İlerleme %0");
	
}

public void addMultipleStudent(Student[] students) {
	
for (Student student : students) {
	
	register(student,"Öğrenci eklendi:");
}	
}

}
