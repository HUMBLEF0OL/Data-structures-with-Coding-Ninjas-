package src;

import java.util.ArrayList;

class MapNode<k,v>
{
	k keys;
	v values;
	MapNode<k,v> next;
	// creating a constructor
	MapNode(k keys,v values)
	{
		this.keys = keys;
		this.values = values;
		this.next = null;
	}
}
	public class Map<k,v>{
		// maintaining a array-list of nodes
		ArrayList<MapNode<k,v>> buckets;
		int count;
		// for default size of the list we have numBuckets
		int numBuckets;
		Map()
		{
			buckets = new ArrayList<>();
			// by default we have 20 buckets
			numBuckets = 20;
			// initializing all the nodes in the array list to be null
		for(int i=0;i<numBuckets;i++)
			buckets.add(null);
	}
		private int getBucketIndex(k key)
		{
			// hashCode will generate the hash code for us
			int index = key.hashCode();
			// compressing the index
			index = index%numBuckets;
			return index;
		}
	public  void rehashing()
	{
		ArrayList<MapNode<k,v>> temp = buckets;
		buckets = new ArrayList<>();
		//setting count = 0 and numBuckets = numBuckets*2;
		count = 0;
		numBuckets = numBuckets*2;
		count = 0;
		for(int i = 0; i<temp.size();i++)
		{
			MapNode<k,v> head = temp.get(i);
			while(head!=null)
			{
				k key = head.keys;
				v value = head.values;
				insert(key,value);
				head = head.next;
			}		
		}
		
	}
		
	public void insert(k key, v value)
	{
		int bucketIndex = getBucketIndex(key);
		// now checking whether the key already present in the bucket or not
		MapNode<k,v> head = buckets.get(bucketIndex);
		while(head!=null)
		{
			// if key is already present then update its value
			if(head.keys.equals(key))
			{
				head.values = value;
				return;
			}
			head = head.next;
		}
		// if the key is not present then we will insert it at the beginning
		head = buckets.get(bucketIndex);
		MapNode<k,v> newNode = new MapNode<>(key,value);
		// updating the links
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;	// for maintaining the size
		// finding the load factor
		double loadFactor = (1.0*count)/numBuckets;
		// if load factor becomes greater than 0.7 we will do rehashing(increase the size of list)
		if(loadFactor > 0.7)
		{
			rehashing();
		}
	}
	
	// removing a particular key
	public v remove(k key)
	{
		// first find the key\
		int bucketIndex = getBucketIndex(key);
		MapNode<k,v> head = buckets.get(bucketIndex);
		MapNode<k,v> prev= null;
		while(head!=null)
		{
			// if we find the key then we will connect the next of head to prev
			if(head.keys.equals(key))
			{
				// if we are deleting nodes other than root
				if(prev!=null)
					prev.next = head.next;
				// when we are removing the first node then we will update the bucket pointer
				else {
					buckets.set(bucketIndex, head.next);
				}
				count--;
				return head.values;
			}
			
			prev = head;
			head = head.next;
		}
		// if we the key is not present then we will return null
		return null;
	}
	public int size()
	{
		// returns the size of the hash-map
		return count;
	}
	public v getValue(k key)
	{
		// first get the bucket index
		int bucketIndex = getBucketIndex(key);
		MapNode<k,v> head = buckets.get(bucketIndex);
		while(head!=null)
		{
			// if key is already present then update its value
			if(head.keys.equals(key))
			{
				return head.values;
			}
			head = head.next;
		}
		// in case we don't found the element we will return null
		return null;
	}
}
