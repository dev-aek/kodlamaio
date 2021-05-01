package homeworkD3;

public class Student extends User {
	
	String haveToLessonString; // kaydolduðu dersler

	public Student(int id, String fullName, String userName, String password, String email,String haveToLessonString) {
		super(id, fullName, userName, password, email);
		this.haveToLessonString=haveToLessonString;		
	}

	public String getHaveToLessonString() {
		return haveToLessonString;
	}

	public void setHaveToLessonString(String haveToLessonString) {
		this.haveToLessonString = haveToLessonString;
	}
		

}
