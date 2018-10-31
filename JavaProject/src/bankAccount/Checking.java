package bankAccount;

public class Checking extends Account {

	// list propeties specific to checking account

	private int debitCardNumber;
	private int debitCardPIN;

	// constructor to initialise checking account prperties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		System.out.println("account number : " + this.accountNumber);
		System.out.println("New checking account");

		setDebitCard();

	}

	@Override
	public void setRate() {
		System.out.println("Implemented rate for checking");
		rate = getbaseRate() * .15;
		// calling from interface and rate is from account
	}

	// list any method specific to checking account

	private void setDebitCard() {

		debitCardNumber = (int) (Math.random() * Math.pow(10, 3));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

		System.out.println(" debit card number : " + this.debitCardNumber);
		System.out.println("debut card pin " + this.debitCardPIN);

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Account tyoe is Checking");
		System.out.println("Your checking CCOUNT FEATURES" + "\ndebit card number " + debitCardNumber
				+ "\nDebit Card PIn :" + debitCardPIN

		);

	}

}
