package homeworkD2;


public class Main {
	
	//We simulated the course tab on the site (kodlama.io).

  public static void main(String[] args) {

      Course course1 = new Course(
              "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demirog", "�cretsiz", 8);
      
      Course course2 = new Course(
              "Programlamaya Giri� i�in Temel Kurs", "Engin Demirog", "�cretsiz", 100);
      
      Course course3 = new Course(
              "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demirog", "Free", 0);
      
      Course[] courses = {course1, course2, course3};

      CourseManager courseManager = new CourseManager();
      
      System.out.println("\n" + "Kodlama.io / Kurslar"+"\n");

      for (Course course : courses) {
          System.out.println("Course Name: " + course.courseName);
          System.out.println("Teacher: " + course.courseTeacher);
          System.out.println("Course Price: " + course.coursePrice);
          System.out.println("Completion Rate: " + "%" + course.completionRate);
          System.out.println("\n" + "------" + "\n");

      }


      for (Course courseInfo : courses) {
    	  
          courseManager.Registration(courseInfo);
          courseManager.Completion(courseInfo);
          System.out.println("\n" + "------" + "\n");
      }

  }
}
