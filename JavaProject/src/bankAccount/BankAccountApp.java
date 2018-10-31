package bankAccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

//		Checking chkacc1 = new Checking("Akash Mohan Chaudhary", "werdfre", 43.4);
//
//		Saving savAcc1 = new Saving("AKASH MOHAN CHADUHARY", "fgfhtrgfhf", 675.57);
//
//		savAcc1.showInfo();
//		System.out.println("*******************");
//		chkacc1.showInfo();
//
////		savAcc1.deposit(5000);
////		savAcc1.withdraw(200);
////		savAcc1.transfer("Brokerage", 3000);
//
//		savAcc1.compound();

		List<Account> accounts = new LinkedList<>();
		
		// read a csv file then create a new account on that data

		// String file = "C:\\SDETuniversity\\files\\ewbanaccount.csv"
		List<String[]> newAccountHolder = utilities.CSV.read(file); // pass the file path

		for (String[] accountHolder : newAccountHolder)
			System.out.println("New Account");
		String name = accountHolder[0];
		String sSN = accountHolder[1];
		String accountType = accountHolder[2];
		double initDeposit = Double.parseDouble(accountHolder[3]);

		System.out.println("name " + sSn + " " + accountType + " " + initDeposit);

		if (accountType.equals("Savings")) {

			System.out.println("Open saving accounts");
			accounts.add(new Saving(name, sSN, initDeposit));
		
		} else if (accountType.equals("Checking")) {
			accounts.add(new Checking(name, sSN, initDeposit));
			System.out.println("Open checking accounts");
		} else {
			System.out.println("error in account");
		}
		
		accounts.get(5).showInfo(); // account[5].showInfo()
		
		for(Account acc: accounts) {
			System.out.println("************\n");
			acc.showInfo();
		}
		accounts.get((int)(Math.random()*accounts.size())).deposit(1000);
		accounts.get((int)(Math.random()*accounts.size())).deposit(500);
		

		//
//			System.out.println(accountHolder[0]);
//		
//			System.out.println(accountHolder[1]);
//			System.out.println(accountHolder[2]);
//			System.out.println(accountHolder[3]);
	}

}
