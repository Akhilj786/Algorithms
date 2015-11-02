package DS;

public class myHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myHashTable myhash=new myHashTable(10);
		System.out.println(myhash.get(0));
		myhash.set(0, 100);
		System.out.println(myhash.get(0));
		myhash.set(1, 200);
		System.out.println(myhash.get(1));
		
		myhash.set(1,201);
		System.out.println(myhash.get(1));
		myhash.remove(1);
		System.out.println(myhash.get(1));
	}

}


class myHashTable{
	private Item hash[];
	private int size;
	
	public myHashTable(int total){
		this.size=total;
		this.hash=new Item[total];
		for(int i=0;i<total;i++)
			this.hash[i]=new Item();
	} 
	
	// HashFunction
	public int getIndex(int key){
		int index=key%size;
		return index;
		
	}
	
	public void set(int key,int val){
		int index=getIndex(key);
		
		hash[index].key=key;
		hash[index].val=val;
	}
	
	public int get(int key){
		int index=getIndex(key);
		if(hash[index].key==-1)
			return -1;
		return hash[index].val;
	}
	
	public boolean remove(int key){
		int index=getIndex(key);
		if(hash[index].key==-1)
			return false;
		hash[index].key=-1;
		hash[index].val=-1;
		return true;
	}
	
	
}

class Item{
	int key;
	int val;
	public Item(){
		key=-1;
		val=-1;
	}
}
