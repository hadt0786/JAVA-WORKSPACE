package java_basic;

public class ControlFLow {
	//the ide is if else to branch it out in mutiple connection
	public static void main(String[] args) {
		
		//idea of if else
		boolean hungy = true;
		
		if(hungy) {
			//if(hungy == true) same thing (2==2) always true
			System.out.println("If processed");
		}else {
			System.out.println("else processed");
			
		}
		int hunerRating =5;
		if(!(hunerRating<6)) {
			//if(hungy == true) same thing (2==2) always true
			System.out.println("If processed");
		}else {
			System.out.println("else processed");
			
		}
		int favTemp = 75;
		int curTemp = 60;
		
		String opinion = null;
		
		if(curTemp<favTemp -30) {
			opinion = "damm cold";
			
		}
		else if(curTemp<favTemp -20) {
			opinion = "Its a ckind of cold out";
			
		}
		else if(curTemp > favTemp +10) {
			opinion = "its not out";
		}else {
			opinion = "its a beaufitufl day";
		}
		else {
			opinion = "invald";
		}
		System.out.println(opinion);
	
		int month = 6;
		String monthString;
		
		switch(month) {
		case 1:monthString = "January";
		break;
		case 2:monthString = "Febuary";
		break;
		case 3:monthString = "MArch";
		break;
		case 4:monthString = "April";
		break;
		default : monthString ="Unknown Month";
		break;
		}
		
	}

}
