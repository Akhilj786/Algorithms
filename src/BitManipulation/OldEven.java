package BitManipulation;

public class OldEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			printOddEven(i);
		int array[]={2,3,4,5,6};
		printRandomOrder(array);
	}

	public static void printOddEven(int n) {
		int odd = 1;
		if ((n & odd)>0)
			System.out.println(n+":Odd");
		else
			System.out.println(n+":Even");
	}
	
	public static void printRandomOrder(int array[]){
		int prev=array[0];
		int next=1;
		for(int i=0;i<array.length;i++){
			
			next=(i==array.length-1?array[i]:array[i+1]);
			int club=array[i]*next*prev;
			array[i]=club/array[i];
			
			
			prev=club/(prev*next);
			System.out.print(array[i]+" ");
		}
	}

}
