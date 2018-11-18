package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many users you want to add		
		System.out.println("enter number of students");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Student[] students = new Student[num]; 
		for(int i=0;i<num;i++) {
			students[i]=new Student();
			students[i].enroll();
			students[i].pay();
			System.out.println(students[i].showstat());
		}
		
	}

}
