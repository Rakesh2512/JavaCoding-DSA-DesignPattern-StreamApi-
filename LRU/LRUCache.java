package LRU;

import java.util.HashMap;
import java.util.Map;

class Node{
	int key;
	int value;
	Node prev;
	Node next;
	
	Node(int key,int value){
		this.key = key;
		this.value = value;
		this.prev = null;
		this.next = null;
	}
	
}
public class LRUCache {
	
	int capacity;
	Map<Integer,Node>cache;
	Node head;
	Node tail;
	
	LRUCache(int capacity){
		this.capacity = capacity;
		this.cache = new HashMap<>();
		this.head = new Node(-1,-1);
		this.tail = new Node(-1,-1);
		this.head.next = this.tail;
		this.tail.prev = this.head;
	}
	
	public void put(int key,int value) {
		if(cache.containsKey(key)) {
			Node removeNode = cache.get(key);
			remove(removeNode);
		}
		
		Node newNode = new Node(key,value);
		cache.put(key, newNode);
		add(newNode);
		
		if(cache.size() > capacity) {
			Node nodeToDelete = tail.prev;
			remove(nodeToDelete);
			cache.remove(nodeToDelete.key);
		}
	}
	
	public int get(int key) {
		
		if(!cache.containsKey(key)) {
			return -1;
		}
		
		Node node = cache.get(key);
		remove(node);
		add(node);
		
		return node.value;
		
	}
	
	public void add(Node node) {
		
		Node nextNode = head.next;
		
		head.next = node;
		node.prev = head;
		
		node.next = nextNode;
		nextNode.prev = node;
	}
	
	public void remove(Node node) {
		
		Node prevNode = node.prev;
		Node nextNode = node.next;
		
		prevNode.next = nextNode;
		nextNode.prev = prevNode;
	}

	public static void main(String[] args) {
		
		LRUCache cache = new LRUCache(2);
		
		cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
	}

}
