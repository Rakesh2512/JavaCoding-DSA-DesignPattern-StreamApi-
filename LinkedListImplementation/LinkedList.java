package LinkedListImplementation;


class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
		next = null;
	}
}
public class LinkedList {
	
	
	Node head;
	
	public void add(int value) {
		
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public void display() {
		Node curr = head;
		
		while(curr != null) {
			System.out.print(curr.value+" ");
			curr = curr.next;
		}
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void delete(int value) {
		if(head == null) {
			return;
		}
		if(head.value == value) {
			head = head.next;
			return;
		}
		
		Node curr = head;
		Node prev = null;
		while(curr != null && curr.value != value) {
			
			prev = curr;
			curr = curr.next;
		}
		
		if(curr != null) {
			prev.next = curr.next;
		}
	}

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		l.display();

	}

}
