package Strings;

public class ValidShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isValid(String s1,String s2,String s3){
		if((s1.length()+s2.length())!=s3.length())
			return false;
		int i=0,j=0,k=0;
		while(k<s3.length()){
			char c1=s1.charAt(i);
			char c2=s2.charAt(j);
			char c3=s3.charAt(k);
			
			
		}
	}

}
