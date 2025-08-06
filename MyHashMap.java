
class Entity<K,V>{
	
	K Key;
	V Value;
	Entity<K,V>next;
	
	Entity(K Key,V Value){
		this.Key = Key;
		this.Value = Value;
	}
}
public class MyHashMap<K,V> {
	
	int size = 16;
	Entity<K,V>[]bucket;
	
	public MyHashMap() {
		this.bucket = new Entity[size];
		
	}
	
	public int getIndex(K Key) {
		return Math.abs(Key.hashCode()) % size;
	}
	
	public void put(K Key,V Value) {
		
		int index = getIndex(Key);
		
		Entity<K,V> head = bucket[index];
		
		while(head != null) {
			if(head.Key.equals(Key)) {
				head.Value = Value;
				return;
			}
			head = head.next;
		}
		
		Entity<K,V>newEntity = new Entity<>(Key,Value);
		
		newEntity.next = bucket[index];
		bucket[index] = newEntity;
		
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
	
	public void delete(K Key) {
		
		int index = getIndex(Key);
		Entity<K,V>head = bucket[index];
		Entity<K,V>prev = null;
		
		while(head != null) {
			
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
	
	
	public static void main(String[] args) {
		
		MyHashMap<String, Integer>mp = new MyHashMap<>();
		
		mp.put("abc",1);
		mp.put("cde",2);
		mp.put("ghi",5);
		
		System.out.println(mp.get("cde"));
		mp.delete("cde");
		
		System.out.println(mp.get("cde"));
		
		
		
	}

}
