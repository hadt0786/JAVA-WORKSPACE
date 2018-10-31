package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName, studentId, lastName, courses = null;
	private int gradeYear, tuitionBalance = 0;

	private static int id = 1001;
	private static int costOfCourse = 600;

	// constructor : prompt user to enter the student name and year

	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter student first name");

		this.firstName = in.nextLine();

		System.out.println("Enter student last name");

		this.lastName = in.nextLine();

		System.out.println(
				" 1 - freshman \n2" + "2 - sophomer \n3 - Junior" + "\n4 -  for senior" + "\n Enter the class level");

		this.gradeYear = in.nextInt();

		setStudentId();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

	}

	// genrate Id

	private void setStudentId() {
		// grade level + ID
		id++;
		this.studentId = gradeYear + "" + id;
	}

	// enroll courses

	public void enroll() {
		// get inside a loop , user hits 0
		do {
			System.out.println("enter a course to enroll " + "(0 to quit): ");

			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance += costOfCourse;
			} else {
				System.out.println("break");
				break;
			}

		} while (1 != 0);

		System.out.println("Enroll in : " + courses);
		System.out.println("tuition balance " + tuitionBalance);

	}

	// View Balance

	public void viewBalance() {
		System.out.println("your balance is " + tuitionBalance);

	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("\n ENter your paymnet : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("" + "thank you for your payment of : " + payment);
		viewBalance();

	}

	// show status
	public String toString() {

		return "Name: " + firstName + " " + lastName + "\nCourses Enrolled : " + courses + "\nBalance: $"
				+ tuitionBalance;

	}
}
