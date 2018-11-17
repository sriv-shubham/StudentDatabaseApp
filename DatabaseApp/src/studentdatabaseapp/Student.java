package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int year;
	private String courses;
	private int studentId;
	private int tutionBalance;
	private int costOfCourse;
	
	//Constructor: prompt user to enter name and year
	public Student() {
		System.out.println("Enter first Name");
		Scanner in = new Scanner(System.in);
		this.firstName=in.nextLine();
		System.out.println("Enter last Name");
		Scanner in2 = new Scanner(System.in);
		this.lastName=in2.nextLine();
		System.out.println("Enter Year:\n1 - Fresher\n2 - Second\n3 - Third\n4 - Final\n");
		Scanner in3=new Scanner(System.in);
		this.year=in3.nextInt();
	}
	//Generate an ID
	
	//Enroll in courses
	
	//View Balance
	
	//Pay Tution
	
	//Show Status
}
