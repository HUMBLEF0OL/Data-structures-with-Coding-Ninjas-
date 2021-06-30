/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {
public static int length(LinkedListNode<Integer> head) 
    {
		int counter = 0;
		LinkedListNode<Integer> temp = head;
		while (temp != null) 
        {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int number) 
    {
		int l = length(head)-1;
		if(number > l || number == 0)
			return head;
		int counter = l-number;
		LinkedListNode<Integer> t1 = head;
		while(counter>0)
		{
			t1 = t1.next;
			counter--;
		}
		LinkedListNode<Integer> a1 = t1.next;
		t1.next = null;
		LinkedListNode<Integer> a2 = a1;
		for(int i=1;i<number;i++)
		{
			a2 = a2.next;
		}
		a2.next = head;
		head = a1;
		return head;
	}	
}
