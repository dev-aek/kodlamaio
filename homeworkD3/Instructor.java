package homeworkD3;

public class Instructor extends User {

	int haveTotalMembers; // Sahip olduðu üyelikler (öðrenciler)
	String haveToTraining; // Sahip olduðu dersler
		

	public Instructor(int id, String fullName, String userName, String password, String email, int haveTotalMembers, String haveToTraining) {
		super(id, fullName, userName, password, email);
		
		this.haveTotalMembers = haveTotalMembers;
		this.haveToTraining = haveToTraining;
	}

	public int getHaveTotalMembers() {
		return haveTotalMembers;
	}

	public void setHaveTotalMembers(int haveTotalMembers) {
		this.haveTotalMembers = haveTotalMembers;
	}

	public String getHaveToTraining() {
		return haveToTraining;
	}

	public void setHaveToTraining(String haveToTraining) {
		this.haveToTraining = haveToTraining;
	}
	
}
