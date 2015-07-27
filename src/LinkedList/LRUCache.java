package LinkedList;

import java.util.HashMap;

public class LRUCache {
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;
	int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}

		return -1;
	}

	public void remove(Node n) {
		if (n.pre == null) {
			head = n.next;
			n.next.pre = null;
		} else if (n.next == null) {
			end = n.pre;
			n.pre.next = null;
		} else {
			n.pre.next = n.next;
			n.next.pre = n.pre;
		}
	}

	public void setHead(Node n) {
		n.next = head;
		n.pre = null;

		if (head != null)
			head.pre = n;

		head = n;

		if (end == null)
			end = head;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			Node created = new Node(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(created);

			} else {
				setHead(created);
			}

			map.put(key, created);
		}
	}
	
	public void printNode(){
		Node temp=head;
		while(temp!=null){
			System.out.print("<"+temp.key+","+temp.value+"> ");
			temp=temp.next;
		}
		System.out.println();
	}

}

class Node {
	int key;
	int value;
	Node next;
	Node pre;

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}

}
