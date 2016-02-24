package Interview;

import java.util.Hashtable;

public class Twitter_phone_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hash=new Hashtable<Integer,String>();
		String num="123";
		//1 -> "ABC", 2 -> "DE", 3-> "XY"
		hash.put(1,"ABC");
		hash.put(2,"DE");
		hash.put(3,"XY");
		phoneStringDriver(num);
		int num1=123;
		//getPermRec(num1,"",hash);
	}
	public static Hashtable<Integer,String> hash;

	public static void phone_toString(Hashtable<Integer,String> hash,String num,String ans,int d){
	    if(d==num.length()){
	        System.out.println(ans);
	       // ans="";
	    }
	    else{
	    	int i=num.charAt(d)-'0';
	        String s=hash.get(i);

	        for(int j=0;j<s.length();j++){ 
	            phone_toString(hash,num,ans+s.charAt(j),d+1);
	        }
	        
	    }
	    
	}

	public static void phoneStringDriver(String num){
	    phone_toString(hash,num,"",0);
	}
	
	
	static void getPermRec(int num, String str, Hashtable<Integer,String>m) {
	    if (num == 0) {
	        System.out.println(str);
	    } else {
	        int curDigit = num % 10;
	        int newNum = num / 10;
	        String s = m.get(curDigit);
	        for (int i = 0; i < s.length(); i++) {
	            getPermRec(newNum, s.charAt(i) + str, m);
	    }
	        return;

	    }
	}

}
