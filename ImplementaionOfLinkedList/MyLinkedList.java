package ImplementaionOfLinkedList;


class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
		this.next = null;
	}
}
public class MyLinkedList {
	
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
			System.out.print(curr.value+"->");
			curr = curr.next;
		}
		System.out.println();
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
		
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.display();
		
		list.addFirst(7);
		list.display();
		
		list.delete(3);
		
		list.display();
		
		
	}

}
