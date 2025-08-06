
public class Queue {
	
	int size;
	int rear;
	int front;
	int[] a;
	
	
	Queue(int size){
		this.size = size;
		a = new int[size];
		rear = -1;
		front = 0;
	}
	
	public void add(int value) {
		if(isFull()) {
			System.out.println("Queue is Full ");
			return;
		}
		rear++;
		a[rear]= value;
	}
	
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		return a[front];
		
	}
	
	public int poll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty ");
			return -1;
		}
		int value = a[front];
		a[front] =0 ;
		front++;
		return value;
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Queue is Emtpy");
			return;
		}
		
		for(int i = front;i<=rear;i++) {
			System.out.print(a[i]+"->");
		}
		System.out.println();
	}
	public boolean isEmpty() {
		return front > rear;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.print();
		System.out.println(q.poll());
		q.print();
		System.out.println(q.peek());
		q.poll();
		q.poll();
		q.poll();
		q.poll();
		
		
	}

}
