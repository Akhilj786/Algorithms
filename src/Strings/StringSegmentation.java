package Strings;
import java.util.*;
public class StringSegmentation{
	static ArrayList<String> list=new ArrayList<String>();
	static boolean flag=true; 
	static Map<String, String> memoized=new HashMap<String,String>();

	public static void main(String args[]){
		Set<String> set=new HashSet<String>();
		set.add("three");
		set.add("four");
		String input="fourthree";
		
		String res1=segmentation1(input,set);
		System.out.println(res1);

		segmentation2(input,set,0,0);
		if(flag==true)
			System.out.println(list);

		String res2=segmentation3(input,set);
		System.out.println(res2);


	}

	// This method assumes to split into 2 words only.
	public static String segmentation1(String input,Set<String> dict){
		int len = input.length();
  		for (int i = 1; i < len; i++) {
    		String prefix = input.substring(0, i);
    		if (dict.contains(prefix)) {
      			String suffix = input.substring(i, len);
      			if (dict.contains(suffix)) {
        			return prefix + " " + suffix;
      			}
    		}
  		}
  		return null;
	}
	// Recursive call
	public static void segmentation2(String input,Set<String> dict,int i,int j){
		if(j==input.length())
			return;
		String temp=input.substring(i,j+1);
		if(j<input.length() && dict.contains(temp)){
			list.add(temp);
			flag=true;
			segmentation2(input,dict,j+1,j+1);
			//System.out.println(list);
		}else{
			flag=false;
			segmentation2(input,dict,i,j+1);
		}
	}
	public static String segmentation3(String input,Set<String> dict){
		if (dict.contains(input)) return input;
  		if (memoized.containsKey(input)) {
    		return memoized.get(input);
  		}
  		int len = input.length();
  		for (int i = 1; i < len; i++) {
    		String prefix = input.substring(0, i);
    		if (dict.contains(prefix)) {
      			String suffix = input.substring(i, len);
      			String segSuffix = segmentation3(suffix, dict);
      			if (segSuffix != null) {
        			memoized.put(input, prefix + " " + segSuffix);
        			return prefix + " " + segSuffix;
				}
			}
		
		}
		memoized.put(input, null);
		return null;
	}
}