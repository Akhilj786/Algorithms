package DynamicProgram;

public class MaxStolen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 6, 1, 2, 3, 9 };
		System.out.println(maxStolen(array));
	}

	public static int maxStolen(int array[]) {
		/*
		 * int l[]=new int[array.length]; l[0]=array[0];
		 * l[1]=Math.max(array[0],array[1]); for(int i=2;i<array.length;i++){
		 * l[i]=l[i-2]+array[i]; } return l[array.length-1];
		 */
		//Optimization using 2 values only
		int val1=array[0];
		int val2=Math.max(array[0],array[1]);
		int val=Integer.MIN_VALUE;
		for(int i=2;i<array.length;i++){
			val=Math.max(val2, val1+array[i]);
			val1=val2;
			val2=val;
		}
		
		return val;
		
	}

}
