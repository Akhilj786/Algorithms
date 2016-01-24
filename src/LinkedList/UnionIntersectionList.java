package LinkedList;

import java.util.*;

public class UnionIntersectionList{
	// Union of Lists
	public ArrayList<Integer> union(LinkedList list1,LinkedList list2){
		HashSet<Integer> hash=new HashSet<Integer>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		if(list1==null && list2==null){
			return null;
		}

		LinkedList temp = list1;
		while (temp != null) {
			//System.out.print(temp.data + " ");
			int val=temp.data;
			res.add(val);
			hash.add(val);
			temp = temp.next;
			
		}

		temp=list2;
		while (temp != null) {
			//System.out.print(temp.data + " ");
			int val=temp.data;
			if(!hash.contains(val)){
				hash.add(val);
				res.add(val);
			}
			temp = temp.next;
		}
		return res;
	}
	// Intersection of Lists
	public ArrayList<Integer> intersect(LinkedList list1,LinkedList list2){
		HashSet<Integer> hash=new HashSet<Integer>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		if(list1==null && list2==null){
			return null;
		}

		LinkedList temp = list1;
		while (temp != null) {
			
			int val=temp.data;
			hash.add(val);
			temp = temp.next;
		}

		temp=list2;
		while (temp != null) {
			int val=temp.data;
			if(hash.contains(val)){
				res.add(val);
			}
			temp = temp.next;
		}
		return res;
	}
}