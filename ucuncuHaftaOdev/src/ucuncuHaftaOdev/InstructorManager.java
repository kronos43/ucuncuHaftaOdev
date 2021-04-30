package ucuncuHaftaOdev;

public class InstructorManager extends UserManager {
	public void ViewCourse() {
		System.out.println("Viewing course as instructor...");
	}
	
	public void JoinCourse() {
		System.out.println("Joining course as instructor...");
	}
	
	public void AddMultipleCourse(Course[]courses) {
		for(Course course : courses) {
			AddCourse(course);
			
		}

	}
	
	public void AddCourse(Course course) {
		System.out.println(course.courseName + "Course added.");
		
	}

	public void DeleteCourse() {
		System.out.println("Course deleted.");
	}
	
	public void UpdateCourse() {
		System.out.println("Course updated.");
	}
}
