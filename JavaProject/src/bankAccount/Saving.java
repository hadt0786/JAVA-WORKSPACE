package bankAccount;

public class Saving extends Account {

	// list propeties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositKey;

	// constructor to initialise saving account prperties
	public Saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("account number : " + this.accountNumber);

		System.out.println("New saving Account");
		safetyDepositbox();

	}
	@Override
	public void setRate() {
		System.out.println("Implemented rate for saving");
		rate = getbaseRate()-.25;
		// get base rate is from interface and rate is from Account class
		
	}

	private void safetyDepositbox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// list any method specific to saving account

	public void showInfo() {

		System.out.println("Account tyoe is Checking");

		super.showInfo();

		System.out.println("your saving account features : " + "\n Safety deposi box id : " + safetyDepositBoxID
				+ "\n safet deposit Box key : " + safetyDepositKey

		);

	}
}
