package StackImplementation;

public class Stack {
	
	int[] a;
	int top;
	int size;
	
	Stack(int size){
		this.size = size;
		a = new int[size];
		top = -1;
	}
	
	
	public void add(int value) {
		if(isFull()) {
			System.out.println("Stack is OverFlow");
			return;
		}
		top++;
		a[top] = value;
	}
	
	public int top() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return a[top];
		
	}
	
	public int poll() {
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		int poll = a[top];
		a[top] = 0;
		top--;
		return poll;
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		
		Stack st = new Stack(4);
		st.add(1);
		st.add(2);
		st.add(3);
		
		st.add(4);
		
		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st.poll());

	}

}
