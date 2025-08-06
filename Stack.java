
public class Stack {
	
	int size;
	int[] a;
	int top;
	
	Stack(int size){
		this.size =size;
		a = new int[size];
		top = -1;
	}
	
	public void add(int value) {
		if(isFull()) {
			System.out.println("Stack is overFlow");
			return;
		}
		top++;
		a[top] = value;
	}
	
	public int top() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return a[top];
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return-1;
		}
		int value = a[top];
		a[top] = 0;
		top--;
		return value;
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
		
		st.add(5);
		
		

	}

}
