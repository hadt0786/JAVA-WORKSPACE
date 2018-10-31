package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
//
//		Student stu1 = new Student();
//
//		stu1.enroll();
//		stu1.payTuition();
//		System.out.println(stu1.toString());
// 		// to avoid this we going to student[]
//		Student stu1 = new Student();
//
//		stu1.enroll();
//		stu1.payTuition();
//		System.out.println(stu1.toString());
//
//		Student stu1 = new Student();
//
//		stu1.enroll();
//		stu1.payTuition();
//		System.out.println(stu1.toString());

		// Ask how many new user we want to add

		System.out.println("Enter the new student to enroll :");
		Scanner in = new Scanner(System.in);

		int numOfStudents = in.nextInt();

		Student[] students = new Student[numOfStudents];

		// Create n number of new students

		for (int n = 0; n < numOfStudents; n++) {

			students[n] = new Student();
			// Student stu1 = new Student();

			students[n].enroll();
			students[n].payTuition();

//			System.out.println(students[n].toString());

		}

//		System.out.println(students[0].toString());

//		System.out.println(students[1].toString());

//		System.out.println(students[2].toString());
// throws out of bound

		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}

}
