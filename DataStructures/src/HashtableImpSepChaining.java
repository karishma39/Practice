package DS;

import java.util.ArrayList;
import java.util.Objects;

class HashNode<K,V>
{
	int hashcode;
	V value;
	K key;
	HashNode<K,V> next;
	
	public HashNode(V value, K key, int hashcode) {
		super();
		this.value = value;
		this.key = key;
		this.hashcode = hashcode;
	}
	
}
class Map<K,V>
{
	ArrayList<HashNode<K,V>> buckets = new ArrayList<HashNode<K,V>>();

	private int noOfbuckets;
	private int size;
	
	public Map() 
	{
		noOfbuckets = 10;
		size = 0;
		
		for (int i = 0; i < noOfbuckets; i++)
			buckets.add(null);
	}
	
	private final int hashCode (K key) 
	{
        return Objects.hashCode(key);
    }
	
	private int getIndex(K key)
	{
		int hashcode = hashCode(key);
		int index= hashcode % noOfbuckets;
		
		return index<0 ? index*-1 : index;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public void add(K key, V value)
	{
		int index=getIndex(key);
		HashNode<K,V> head = buckets.get(index);
		
		//update if key is present
		while(head!=null) {
			if(head.key.equals(hashCode(key)) && head.hashcode == hashCode(key))
			{
				head.value=value;
				return;
			}
			
			head=head.next;
		}
		
		//insert
		head = buckets.get(index);
		HashNode<K,V> node=new HashNode(value, key, hashCode(key));
		node.next=head;
		buckets.set(index, node);
		
		size++;
		
	}
	
	public V remove(K key)
	{
		HashNode<K,V> head = buckets.get(getIndex(key));
		HashNode<K,V> prev = null;
		
		while(head!=null)
		{
			if(head.key.equals(key) && head.hashcode == hashCode(key))
				break;
			
			prev=head;
			head=head.next;
		}
		
		if(prev!=null)
		{
			prev.next=head.next;
		}
		else
		{
			buckets.remove(head);
		}
		
		size--;
		return head.value;
		
	}
	
	public V get(K key)
	{
		HashNode<K,V> head = buckets.get(getIndex(key));
		
		while(head!=null)
		{
			if(head.key.equals(key) && head.hashcode == hashCode(key))
				return head.value;
			
			head=head.next;
		}
		
		return null;
	}
	
}

public class HashtableImpSepChaining {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new Map();
		map.add("abc", 12);
		map.add("xyz", 20);
		map.add("uvw", 30);
		
		System.out.println(map.get("xyz"));
		System.out.println(map.size());
		System.out.println(map.remove("abc"));
		System.out.println(map.size());
	}

}
