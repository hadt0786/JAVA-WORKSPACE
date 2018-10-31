package bankAccount;

/***
 * 
 * 
 * */


public interface IBaseRate {

	// write a methd that returns the base rate
	default double getbaseRate() {
		return 2.5;
	}
	
}
