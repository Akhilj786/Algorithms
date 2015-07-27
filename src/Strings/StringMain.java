package Strings;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Evaluate reverse polish Notation
		EvalRPN erpn=new EvalRPN();
		String tokens[]={"4", "13", "5", "/", "+"};
		System.out.println(erpn.calcEvalRPN(tokens));
		
	}

}
