package studentdatabaseapp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many users you want to add
		Student stu1 = new Student();
		// create n numbers of new student
		stu1.enroll();
		stu1.pay();
	}

}
