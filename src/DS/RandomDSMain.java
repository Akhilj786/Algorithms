package DS;
import java.util.*;
class RandomDS<T>{
	ArrayList<T> list;
	HashMap<T,Integer> hash;
	int current;
	
	RandomDS(){
		list=new ArrayList<T>();
		hash=new HashMap<T,Integer>();
		current=0;
	}

	void add(T data){
		if(!search(data)){
			int size=list.size();
			list.add(data);
			hash.put(data,size);
		}else{
			System.out.println("Already present");
		}
	}

	void remove(T data){
		if(search(data)){
			int index=hash.get(data);
			if(index<0)
				return ; 
			hash.remove(data);
			int size=list.size();
			T lastData=list.get(size-1);
			Collections.swap(list, index, size-1);
			list.remove(size-1);
			hash.put(lastData,index);
		}
	}
	boolean search(T data){
		return(hash.containsKey(data));
	}

	T getRandom(){
		Random rand = new Random();
		T res=null;
		if(list.size()>0){
			int index=rand.nextInt(list.size());
			res=list.get(index);
		}
		return res;

	}


}

public class RandomDSMain{
	public static void main(String args[]){
		RandomDS<Integer> ds=new RandomDS<Integer>();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.add(40);
        System.out.println(ds.search(30));
        ds.remove(20);
        ds.add(50);
        System.out.println(ds.search(50));
        System.out.println(ds.getRandom());

	}
}