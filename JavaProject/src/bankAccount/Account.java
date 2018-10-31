package bankAccount;

/**
 * 
 * parent class common methods
 * 
 * abstract - not able to create object but can create object from children
 * 
 * 
 */

public abstract class Account implements IBaseRate {

	// list common properties for saving and check account
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000; // creating a unique random number
	protected String accountNumber;
	protected double rate;

	// protected because only visible to child class
	
	// constructor to set base properties and initiales a account
	public Account(String name, String sSN, double initDeposit) {
		System.out.print("new account");
		// new account will print first SUPER class cal first

		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;

		System.out.print("Name : " + name + " SSN :" + sSN + " balance : $" + balance);

		// set account number
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("Account Number : " + this.accountNumber);
		// System.out.println(getbaseRate());
		setRate(); // calling from children class
	}

	public abstract void setRate(); // in abstract class abstract method

	private String setAccountNumber() {

		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randNumber;

	}

	public void compound() {
		double acruedInterest = balance * (rate / 100);
		balance = balance + acruedInterest;
		System.out.println("CrudInterest " + acruedInterest);
		printBalance();

	}

	// List common methods

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposit Amount : " + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("withdrawn Amount : " + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + " from" + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("your balance is now" + balance);
	}

	public void showInfo() {
		System.out.println("Name: " + name + "\nAccount Number " + accountNumber + "\nBalance : " + balance + "\nRate "
				+ rate + "%");

	}

}
