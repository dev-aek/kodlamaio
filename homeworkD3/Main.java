package homeworkD3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Abdullah Enes Kocabu�a", "devaek", "password123", "enes02metin@gmail.com", "Java + React");			
	
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1, "��renci Kay�t oldu. ��renci ismi: ");
		studentManager.signIn(student1);
		studentManager.getInformation(student1);
		
		Instructor instructor1 = new Instructor(1, "Engin Demiro�", "devEngin", "password645", "engin@engin.com", 5065, "Java, Programlama giri�, C#");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(instructor1, "E�itmen eklendi. E�itmenin ismi");
		instructorManager.signIn(instructor1);
		instructorManager.getInformation(instructor1);
		instructorManager.addCourse("Algoritma Dersi");
		
		
		//�oklu ��renci ekleme sim�lasyon
		Student student2 = new Student(1, "Abdullah Enes Kocabu�a", "devaek", "password123", "enes02metin@gmail.com", "Java + React");
		Student student3 = new Student(1, "Abdullah Enes Kocabu�a", "devaek", "password123", "enes02metin@gmail.com", "Java + React");
		Student student4 = new Student(1, "Abdullah Enes Kocabu�a", "devaek", "password123", "enes02metin@gmail.com", "Java + React");
		
		Student[] students = {student1,student2,student3,student4};
		studentManager.addMultipleStudent(students);
	}

	
}
