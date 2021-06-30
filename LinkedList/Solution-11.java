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
		while(temp!=null)
		{
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		int length = length(head);
		if(length <= 1)
			return head;
		LinkedListNode<Integer> t1 = head,t2 = head.next;
		int data = 0;
		for(int i = 1;i< length;i++)
		{
			t1 = head;
			t2 = head.next;
			while(t2!=null)
			{
				if(t1.data >= t2.data)
				{
					data = t1.data;
					t1.data = t2.data;
					t2.data = data;
				}
				t1 = t1.next;
				t2= t2.next;
			}
		}
		return head;
	}
}
