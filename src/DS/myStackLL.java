package DS;
// Stack implementation using LinkedList

public class myStackLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack<Integer> s=new stack<Integer>();
		int arr[]={1,2,3,4,5};
		int arr1[]={1,2,3,4,5,6};
		for(int a:arr){
			s.push(a);
		}
		s.printStack();
		System.out.println();
		for(int a:arr1){
			System.out.println(s.pop());
		}
		s.printStack();
	}

}

class stack<T> {
	LL<T> head;

	public void push(T data) {
		LL<T> current = new LL<>(data);
		current.next = head;
		head = current;
	}

	public T pop() {
		if (head == null)
			return null;
		else {
			T obj = (T) head.data;
			head = head.next;
			return obj;
		}
	}

	public void printStack() {
		LL<T> current = head;
		while (current != null) {
			System.out.print(current.getData()+" ");
			current = current.next;
		}
	}

}

class LL<T> {
	T data;
	LL<T> next;

	LL(T data, LL<T> next) {
		this.setData(data);
		this.setNext(next);
	}

	LL(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LL<T> getNext() {
		return next;
	}

	public void setNext(LL<T> next) {
		this.next = next;
	}
}