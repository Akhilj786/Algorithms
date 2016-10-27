package DS;

import java.util.*;

/**
 * Created by AkhilJain on 10/24/16.
 */


public class ImmStack {
    public static void main(String args[]) {
        IStack<Integer> s1 = Stack.empty(Integer.class);
        IStack<Integer> s2 = s1.push(10);
        IStack<Integer> s3 = s2.push(20);
        IStack<Integer> s4 = s2.push(30); // shares its tail with s3.
        Integer t1 = s2.peek();
        System.out.println(t1);
    }

}

interface IStack<T> extends Iterable<T> {
    IStack<T> push(T val);

    IStack<T> pop();

    T peek();

    boolean isEmpty();
}

class Stack<T> implements IStack<T> {
    private T head;
    private IStack<T> tail;

    public Stack(final T head, final IStack<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public static <U> IStack<U> empty(final Class<U> type) {
        return new EmptyStack<U>();
    }

    public boolean isEmpty() {
        return false;
    }

    public T peek() {
        return this.head;
    }

    public IStack<T> pop() {
        return this.tail;
    }

    public IStack<T> push(T value) {
        return new Stack<T>(value, this);
    }

    public Iterator<T> iterator() {
        return new StackIterator<T>(this);
    }

    private static class StackIterator<U> implements Iterator<U> {
        private IStack<U> stack;

        public StackIterator(final IStack<U> stack) {
            this.stack = stack;
        }

        public boolean hasNext() {
            return !this.stack.isEmpty();
        }

        public U next() {
            U result = this.stack.peek();
            this.stack = this.stack.pop();
            return result;
        }

        public void remove() {
        }
    }

    private static class EmptyStack<U> implements IStack<U> {

        public boolean isEmpty() {
            return true;
        }

        public U peek() {
            throw new RuntimeException("empty stack");
        }

        public IStack<U> pop() {
            throw new RuntimeException("empty stack");
        }

        public IStack<U> push(U value) {
            return new Stack<U>(value, this);
        }

        public Iterator<U> iterator() {
            return new StackIterator<U>(this);
        }
    }
}