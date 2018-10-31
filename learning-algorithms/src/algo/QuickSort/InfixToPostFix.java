package algo.QuickSort;

import java.util.Stack;

public class InfixToPostFix {
	//Definig a Stack class for the stack operation
	//operators is an instance or refrence variable of a Stack class
	
	static MyStack operators = new MyStack();
	
	//static Stack eval = new Stack();
	
	public static void main(String[] args) {
		//given input
		String str = "2*3-5";
		
		System.out.println("The expression in ans is "+toans(str));
		System.out.println("Evaluated function is "+Math.abs(eval(toans(str))));
	}
	public static int eval(String exp) {
        Stack<Integer> stack=new Stack<>();
        
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
             
           
            if(Character.isDigit(c))
            stack.push(c-'0');
             
           
            else
            {
                switch(c)
                {
                    case '+':
                    stack.push(stack.pop()+stack.pop());
                    break;
                     
                    case '-':
                    stack.push(stack.pop()-stack.pop());
                    break;
                     
                    case '/':
                    stack.push(stack.pop()/stack.pop());
                    break;
                     
                    case '*':
                    stack.push(stack.pop()*stack.pop());
                    break;
              }
            }
        }
        return stack.pop();    
    }
	
	private static String toans(String str)
	//converts an str expression to ans
	{
		//Symbol is the characters for the string str
		char symbol;
		int digit ;
		
		//ans will be used for storing the Letter, 
		String ans = "";
		
                for(int i=0;i<str.length();++i)
					//for reading an input from the string
                {
                //storing character at symbol i index
                	
                	symbol = str.charAt(i);
                	
                	
                	//Condition 1 : if its is Letter not operand add it to ans
			        
                	if (Character.isLetter(symbol)||Character.isDigit(symbol))
					ans+=symbol;
                	
                	//condition 2: if it is ( then push to stack
                	
                	else if (symbol=='(')
                		
                		//push the symbol 
                	{
				
                		operators.push(symbol);
                		//operators.toString();		
				}
                //condition 2 : condition 2.1 symbol is ) --> unstack that is pop upto 
                // '('
                	
			else if (symbol==')')
				
			//keep pushing upto peek element is (
			{
				
				while (operators.peek() != '(')
				{
					//adding to ans string and popping from the stack 
					ans+=operators.pop();
				}
				//operators.toString();
				//percation step : remove ')'
				operators.pop();		
			}
                //condition while poping from the stack check the priority level
                //int prec (char c) -- > will return the priority level
                //character to be compared --> peek of the stack--> 
                //INCOMING STACK PRIORITY --> varibale -- symbol 
                //InStack priority level -- > peek value of the stack
				else
			
				//print operators occurring before it that have greater precedence
			{
					//ISP(prec (symbol)-->current symbol in the string and ICP prex(stack.peek())-->symbol in the stack)
                    
					while (!operators.isEmpty() && operators.peek()!='(' && prec(symbol) <= prec(operators.peek()))
					
						//popping and adding element to the stack
						ans+= operators.pop();
                    	//printing the ans
                    	System.out.println(ans);
                    	
                    	operators.push(symbol);
				//operators.toString();
			}
		}
		while (!operators.isEmpty())
			//operators.toString();
			ans+=operators.pop();
		return ans;
	}
	//checking the prioruty level 
	
	static int prec(char c) {
		if(c=='+'||c=='-') {
			return 1;
			
		}
		else if(c=='*'||c=='/'||c=='%') {
			return 2;
		}
		return 0;
	}
	
}
