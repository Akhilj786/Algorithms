package Arrays;

public class ArrayBinarySearch {

		public static int binarySearch(int array[],int val,int left,int right){
			while(left<=right){
				int mid=(left+right)/2;
				if(array[mid]==val)
					return mid;
				else if(array[mid]>val)
					right=mid-1;
				else
					left=mid+1;
			}
			return -1;
		}
}
