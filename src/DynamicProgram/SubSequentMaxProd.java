package DynamicProgram;

public class SubSequentMaxProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={6,7,8,1,2,3,9,10};
		System.out.println(subsequenceMaxProduct(array));
	}
	
	public static int subsequenceMaxProduct(int array[]){
		
		if(array.length<3)
			return -1;
		int maxProduct=Integer.MIN_VALUE;
		int length=array.length;
		int leftLow[]=new int[length-1];
		int rightHigh[]=new int[length-1];
		leftLow[0]=array[0];
		rightHigh[length-2]=array[length-1];
		for(int i=1;i<length-1;i++){
			if(array[i]>leftLow[i-1])
				leftLow[i]=array[i];
			else
				leftLow[i]=leftLow[i-1];
			
			if(array[length-i-1]>rightHigh[length-1-i])
				rightHigh[length-2-i]=array[length-i-1];
			else
				rightHigh[length-2-i]=rightHigh[length-1-i];
			
		}
		
		//for(int i=0;i<length-1;i++)
			//System.out.println(leftLow[i]+"-"+rightHigh[i]);
		
		for(int i=1;i<length-1;i++){
			int sum=leftLow[i-1]*array[i]*rightHigh[i];
			if(sum>maxProduct){
				System.out.println(i+":"+leftLow[i-1]+"*"+array[i]+"*"+rightHigh[i]);	
				maxProduct=sum;
				}
		}
			
		
		return maxProduct;
	}
	

}
