package QueueImplementation;

public class Queue {
	
	int[] a;
	int front;
	int rear;
	int size;
	
	Queue(int size){
		this.size = size;
		a = new int[size];
		front = 0;
		rear = -1;
	}
	
	
	public void add(int value) {
		
		if(isFull()) {
			System.out.println("Queue is Full ");
			return;
		}
		rear++;
		a[rear] = value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queus is empty");
			return -1;
		}
		
		return a[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i = front;i<=rear;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public int poll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int poll = a[front];
		front++;
		return poll;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	public boolean isEmpty() {
		return front > rear;
	}

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		q.add(1);
		q.add(2);
		q.add(3);
		q.display();
		q.add(4);
		q.display();
		q.add(5);
		
		System.out.println("front element of queue is "+q.peek());
		int x = q.poll();
		System.out.println(x + " is removed from queue");
		System.out.println("front element of queue is "+q.peek());
		int y = q.poll();
		System.out.println(y + " is removed from queue");
		q.display();
		
	}

}
