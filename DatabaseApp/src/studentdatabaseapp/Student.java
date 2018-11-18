package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int year;
	private String courses="";
	private String studentId;
	private int tutionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
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
		setid();
		System.out.println(firstName+" "+lastName+" "+year+" "+studentId);
	}
	//Generate an ID
	private void setid() {
		id++;
		this.studentId= year+""+id;
	}
	//Enroll in courses
	public void enroll() {
		while(true) {
			System.out.println("Enter Course (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses=courses+course;
				tutionBalance=tutionBalance+costOfCourse;
			}
			else break;
			courses+="\n";
		}
		System.out.println(courses);
	}
	//View Balance
	public void viewbalance() {
		System.out.println("Your Balance is : "+tutionBalance);
	}
	//Pay Tution
	public void pay() {
		viewbalance();
		System.out.println("Enter amount you want to pay");
		Scanner in = new Scanner(System.in);
		tutionBalance-=in.nextInt();
		System.out.println("Thank for Payment");
		viewbalance();
	}
	//Show Status
	public String showstat() {
		return firstName+" "+lastName+"\n"+"TutionBalance : "+tutionBalance+"\n"+
	           courses+"\n";
	}
}
