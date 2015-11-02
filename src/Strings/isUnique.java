package Strings;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"","foo","bar"," "};
		for(String s:str)
			System.out.println(isUniq(s));
		
		
	}
	
	public static boolean isUniq(String str){
		boolean flag[]=new boolean[256];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(flag[val])
				return false;
			flag[val]=true;
			
		}
		
		return true;
	}

}
