package homeworkD2;


public class Course {	
	// we defined the course features in this class.
	
	String courseName;
    String courseTeacher;
    String coursePrice;
    int completionRate;
    
    public Course(String courseName, String courseTeacher, String coursePrice, int completionRate){
    	
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.coursePrice = coursePrice;
        this.completionRate = completionRate;
    }

    
}
