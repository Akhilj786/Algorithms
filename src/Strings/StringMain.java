package Strings;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Evaluate reverse polish Notation
		EvalRPN erpn = new EvalRPN();
		String tokens[] = { "4", "13", "5", "/", "+" };
		System.out.println(erpn.calcEvalRPN(tokens));

		// String permuate
		PermuCombString perm = new PermuCombString();
		perm.permutateString("ab");

		// String distance
		String strings[] = { "ab", "de", "ab", "cd", "ff", "ab", "ac", "ff" };
		stringsDist sDist = new stringsDist();
		sDist.minDist(strings, "ada", "ff");

	}

}
