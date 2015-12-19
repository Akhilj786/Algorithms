package Numbers;
//http://www.ardendertat.com/2011/09/27/programming-interview-questions-4-find-missing-element/
/*
 * There are 4 solution to accomplish this:
 * 1) Naive algo: O(n^2) Compare each elements both array
 * 2) Sort: O(nlogn) 
 * 3) Subtract: Add the elements of each array and then do subtraction
 * 4) Combine two arrays and then do XOR.
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArray[]={4,1,0,2,9,6,8,7,5,3};
		int secondArray[]={6,4,7,2,1,0,8,3,9};
		System.out.println(missingNo4(firstArray,secondArray));	
	}
	
	public static int missingNo4(int array1[],int array2[]){
		int mixArray[]=new int[array1.length+array2.length];
		int i=0;
		int k=0;
		while(i<mixArray.length){
			if(i<array1.length)
				mixArray[i]=array1[i];
			else
				mixArray[i]=array2[k++];
			i++;
			
		}
		
		int result=0;
		for(int j=0;j<mixArray.length;j++){
			result^=mixArray[j];
		}
		return result;
	}
	
}
