package homeworkD3;

public class StudentManager extends UserManager {
	
public void joinToCourse(String course) {
	
	System.out.println(course + " kursuna kat�ld�n�z. �lerleme %0");
	
}

public void addMultipleStudent(Student[] students) {
	
for (Student student : students) {
	
	register(student,"��renci eklendi:");
}	
}

}
