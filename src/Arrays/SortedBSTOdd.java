package Arrays;

public class SortedBSTOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={10,10,20,20,30,30};
		System.out.println(sortedBSTOdd(array));
		
	}
	
	public static int sortedBSTOdd(int array[]){
		int left=0;
		int right=array.length-1;
		while(left<=right){
			if(left==right)
				return array[left];
			int mid=(left+right)/2;
			if(mid%2==0){
				if(array[mid]==array[mid+1])
					left=left+2;
				else
					right=mid;
			}else{
				if(array[mid]==array[mid-1])
					left=left+1;
				else
					right=mid-1;
			}
				
		}
		return array[left];
	}

}
