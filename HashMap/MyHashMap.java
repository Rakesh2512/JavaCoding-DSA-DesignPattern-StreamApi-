package HashMap;


class Entity<K,V>{
	
	K Key;
	V Value;
	Entity<K,V> next;
	
	Entity(K Key,V Value){
		
		this.Key = Key;
		this.Value = Value;
		this.next = null;
	}
}

public class MyHashMap<K,V> {
	
	public int size = 16;
	
	Entity<K,V>[] bucket; 
	
	MyHashMap() {
		bucket = new Entity[size];
	}
	
	public int getIndex(K Key) {
		
		return Math.abs(Key.hashCode() % size);
	}
	
	
	public void put(K Key, V Value) {
		
		int index = getIndex(Key);
		Entity<K,V>head = bucket[index];
		
		Entity<K,V>curr = head;
		
		while(curr != null) {
			if(curr.Key.equals(Key)) {
				curr.Value = Value;
				return;
			}
			curr = curr.next;
		}
		
		Entity<K,V>newEntity = new Entity<>(Key,Value);
			
		newEntity.next = bucket[index];
		bucket[index]= newEntity;
		
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

	public static void main(String[] args) {
		
		MyHashMap<String ,Integer> mp = new MyHashMap<>();
		
		mp.put("a",1);
		mp.put("b",2);
		mp.put("c",3);
		
		System.out.println(mp.get("b"));
		//mp.put("a",);

	}

}
