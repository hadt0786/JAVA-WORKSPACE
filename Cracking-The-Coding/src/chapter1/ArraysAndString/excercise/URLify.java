package chapter1.ArraysAndString.excercise;

/*
 * Write a Method to replace all space in a string <b>"%20"<b> You may assume that the string has suffiecint space at the end to hold the additional character and that you are given
 * given the true length of the string (Note : if implementing in java, please use a character array so that you can perform 
 * this operation in place.) 
 * 
 * Example :
 * Input --> "Mr. John Smith    13"
 * Output -->"Mr.%20John%20SMith"
 * 
 * 
 * String maipulation -- > always start from the end due to presence of extra buffer in the end
 * 
 * Solving approach 
 *  first pass-> count number of spaces, tripling this space we can add how many space we needed
 *  second pass-> reverse order, when we see a space, edit the space if no space copy the original character
 * */


public class URLify {

	
	public void replaceSpace(char[] str, int truelength) {
		int spaceCount =0, index, i=0;
		
		for(i=0; i<truelength; i++) {
			if(str[i]==' ') {
				spaceCount++;
			}
		}
		
		index = truelength+spaceCount*2;
		if(truelength<str.length) str[truelength]='\0'; //ending array in case of excess spaces
		
		for( i =truelength-1;i>=0;i--) {
			if(str[i]==' ') {
				str[index-1]='0';
				str[index-2]='2';
				str[index-3]='%';
				index= index-3;
			}
			else {
				str[index-1]=str[i];
				index--;
			}
		}
	}
	
	
}
