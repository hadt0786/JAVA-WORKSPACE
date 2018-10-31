package practice.strings;

public class StringsPractice {
	
	public static void main(String[] args) {
		
		String a = "hello";
		System.out.println(a);
		System.out.println(a.length());
		
		String str = "ABCDEFG";
		str.length();
		String substr = str.substring(1); //"BCDEF"
		String substr2 = str.substring(2); //"CDEF"
		
		String substr3 = str.substring(0,2); //"AB"
		String substr3 = str.substring(1,3); //"BC"
		String substr3 = str.substring(3,6); //"DEF"
		String substr3 = str.substring(3,7); //"DEFG"
		System.out.println();
		
		String b = "hello";
		String c = "there";
		if(b=="hello") {
			//this is a trap
			
		}
		if(b.equals("hello")) {
			//valid
		}
		if(!b.equals("hello")){
			
		}
		if(c.equals("there")) {
			
		}
		if(c.equals("There")){
			//does not print 
		}
		if(c.equalsIgnoreCase("There")) {
			//valid
		}
		b.charAt(3);//work
		b.charAt(-3);//not work work in python
		b.charAt(13);//string index out of range
		
		String test = "hello yogi there yogi there?";
		
		int t = test.indexOf("there");//index position 6 first occurence
		int t2 = test.indexOf("there", t);
		
		int t3 = test.lastIndexOf("yogi");//12 right to left
		
		
		
		
		
		
		
		
		
	}

}
