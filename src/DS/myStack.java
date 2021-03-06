package DS;

import java.util.ArrayDeque;
import java.util.Queue;

// Stack using queue
public class myStack {
	public Queue<Integer> q1 = new ArrayDeque<Integer>();
	public Queue<Integer> q2 = new ArrayDeque<Integer>();
	public int res=-1;
	public void push(int x) {
		q1.add(x);
	}

	public int pop() {
		int result = -1;
		if (!q1.isEmpty()) {
			int size = q1.size();
			for (int i = 0; i < size - 1; i++) {
				q2.add(q1.remove());
			}
			result = q1.remove();
			Queue<Integer> q3 = new ArrayDeque<Integer>();
			q3 = q1;
			q1 = q2;
			q2 = q3;
		}

		return result;
	}
	
	public int pop1(){
		if(!q1.isEmpty()){
			res=q1.poll();
			return(pop1());
		}
		else{
			q2.add(res);
			
		}
		int result=q2.poll();
		Queue<Integer> q3 = new ArrayDeque<Integer>();
		q3 = q2;
		q2 = q1;
		q1 = q3;
		return result;
	}
	
	public int peek1(){
		if(!q1.isEmpty()){
			res=q1.poll();
			return(pop1());
		}
		else{
			q2.add(res);
			
		}
		int result=q2.peek();
		Queue<Integer> q3 = new ArrayDeque<Integer>();
		q3 = q1;
		q1 = q2;
		q2 = q3;
		return result;
	}

	public int peek() {
		int result = -1;
		if (!q1.isEmpty()) {
			int size = q1.size();
			for (int i = 0; i < size; i++) {
				if (i == size-1)
					result = q1.peek();
				q2.add(q1.remove());
			}

			Queue<Integer> q3 = new ArrayDeque<Integer>();
			q3 = q1;
			q1 = q2;
			q2 = q3;
		}

		return result;
	}
}
