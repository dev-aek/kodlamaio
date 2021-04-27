package homeworkD2;

public class CourseManager {
	//We created methods that give information about the course in this class.
	
    public void Registration(Course course) {
        System.out.println("You attended  " + course.courseName + " course.");
    }

    public void Completion(Course course) {
        if (course.completionRate == 100){
            System.out.println("You have completed " + course.courseName + " course!");
        }

        else {
            System.out.println("You haven't completed. For this " + course.courseName + " course, you need to keep studying!");
        }
    }
}