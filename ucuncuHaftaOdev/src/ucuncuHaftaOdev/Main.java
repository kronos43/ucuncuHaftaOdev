package ucuncuHaftaOdev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Ebra","Ozbalik","123456");
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getStudentNumber());

		Instructor instructor1 = new Instructor(2,"Bilgehan","Buyuakyuz","654321");
		System.out.println(instructor1.getFirstName());
		System.out.println(instructor1.getInstructorNumber());
		
		Course course1 = new Course(1,"CSharp","CSharp Course");
		Course course2 = new Course(2,"Java & React","Java Course");
		
		Course[] courses = new Course[] {course1, course2};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.AddCourse(course1);
		instructorManager.AddMultipleCourse(courses);
		
		StudentManager studentManager= new StudentManager();
		studentManager.JoinCourse();
		studentManager.Login();
	
		
	}

}
