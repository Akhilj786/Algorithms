package Numbers;
import java.util.*;
public class Infix2Postfix{
	public static void main(String args[]){
		String infix="6*3-4";
		String operator="-+*/";
		String postfix=postFix(infix,operator);
		System.out.println("PostFix:"+postfix);
		System.out.println("Result:"+calculatePostfix(postfix,operator));
		
	}
	// Infix to Postfix
	public static String postFix(String infix,String operator){
		StringBuilder str=new StringBuilder();
		Stack<Character> s=new Stack<Character>();
		
		for(int i=0;i<infix.length();i++){
			char c=infix.charAt(i);
			if(operator.indexOf(c)>=0){
				if(s.isEmpty()){
					s.push(c);
					continue;
				}
			while(!s.isEmpty() && preference(s.peek(),c,operator)>0){
							str.append(s.pop());
						}
						s.push(c);
			}else{
				str.append(c);
			}	
		}
		while(!s.isEmpty())
			str.append(s.pop());
		return new String(str);

	}

	public static int preference(char c1,char c2,String str){
		return(str.indexOf(c1)-str.indexOf(c2));
	}

	public static int calculatePostfix(String postfix,String operator){
		
		Stack<Integer> stack=new Stack<Integer>();
		if(postfix==null && postfix.length()==0)
			return -1;
		for(int i=0;i<postfix.length();i++){
			char c=postfix.charAt(i);
			if(operator.indexOf(c)>=0) {
				int c1=stack.pop();
				int c2=stack.pop();

				switch(c){
					case '-':
						stack.push(c2-c1);
						break;
					case '+':
						stack.push(c1+c2);
						break;
					case '*':
						stack.push(c1*c2);
						break;
					case '/':
						stack.push(c2/c1);
						break;
				}
				
			}else{
					//System.out.println(Character.getNumericValue(c));
					int temp=(int)c-48;
					stack.push(temp);
				}

			
		}
		return(stack.pop());

	}

}

