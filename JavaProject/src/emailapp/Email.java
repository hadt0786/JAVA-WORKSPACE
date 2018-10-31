package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName, lastName, password, department, alternateEmail;
	private int defaultPasswordLength = 8;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 500;

	// Constructor to recieve the first name and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// this refers to class varibale
		// firstName referes to local varibale

		System.out.println("Email created " + " " + firstName + " " + lastName);

		// call a method for the department and return the department
		this.department = setDepartment();
		System.out.println("Deaprtment : " + this.department);

		// cal a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + password);

		// combine elements to genrate a email

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;

		System.out.println("your email is " + email);

	}

	// ask for the department
	private String setDepartment() {
		System.out.println(
				"Department Code \nEnter the department \n1 Sales \n2 Devlopment" + "\n3 Accounting \n0 for None");

		Scanner in = new Scanner(System.in);

		int depChoice = in.nextInt();

		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Sales";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return "";
		}

	}

	// genrate a Random Password

	public String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKMNOPQRSTUVWXYZ0123456789!@#$%";

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);
	}

	// default mail capacity

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change the password

	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return getAlternateEmail();
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {

		return "Display Name:" + firstName + " " + lastName + "\n" + "Company email " + email + " "
				+ "mail box capacity" + mailboxCapacity;

	}

}
