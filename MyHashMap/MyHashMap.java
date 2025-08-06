package MyHashMap;

class Entity<K,V>{
	
	K Key;
	V Value;
	Entity<K,V>next;
	
	
	Entity(K Key,V Value){
		this.Key = Key;
		this.Value = Value;
		this.next = null;
	}
}

public class MyHashMap<K,V> {
	
	int size = 16;
	
	Entity<K,V>[] bucket;
	
	MyHashMap(){
		bucket = new Entity[size];
	}
	
	public int getIndex(K Key) {
		
		return Math.abs(Key.hashCode()) % size;
		
	}
	
	public void put(K Key,V Value) {
		
		int index = getIndex(Key);
		
		Entity<K,V>head = bucket[index];
		
		while(head != null) {
			
			if(head.Key.equals(Key)) {
				head.Value = Value;
				return;
			}
			head = head.next;
		}
		
		// need to update on first place on list
		
		Entity<K,V>newNode = new Entity<K,V>(Key,Value);
		newNode.next = bucket[index];
		bucket[index] = newNode;
		
	}
	
	
	public V get(K Key) {
		
		int index = getIndex(Key);
		
		Entity<K,V>head = bucket[index];
		
		while(head != null) {
			
			if(head.Key.equals(Key)) {
				return head.Value;
			}
			head = head.next;
		}
		return null;
		
	}
	
	public void remove(K Key) {
		
		int index = getIndex(Key);
		Entity<K,V>head = bucket[index];
		
		Entity<K,V>prev = null;
		
		while(head != null) {
			
			if(head.Key.equals(Key)) {
				if(prev == null) {
					bucket[index] = head.next;
				}
				else {
					prev.next = head.next;
				}
				return;
			}
			prev = head;
			head = head.next;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyHashMap<String,Integer>mp = new MyHashMap<>();
		
		mp.put("abc",123);
		mp.put("def",456);
		mp.put("ghi",876);
		
		System.out.println(mp.get("def"));
		System.out.println(mp.get("abc"));
		
		mp.remove("def");
		System.out.println(mp.get("def"));
		
		
	}

}
