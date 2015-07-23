package LinkedList;

public class LinkedList {

	int data;
	LinkedList next;

	public LinkedList(int val) {
		this.data = val;
		this.next = null;
	}

	public LinkedList(int val, LinkedList next) {
		this.data = val;
		this.next = next;
	}

	public int getData() {
		return this.data;
	}
}
