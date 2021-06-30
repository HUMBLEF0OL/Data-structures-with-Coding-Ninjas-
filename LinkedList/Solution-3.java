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
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
    {
		LinkedListNode<Integer> temp = head;
		if(temp != null)
		{
			int data = temp.data;
			while(temp.next != null)
			{
				if(temp.next.data == data)
				{
					temp.next = temp.next.next;
				}
				else
				{
					data = temp.next.data;
					temp = temp.next;
				}
			}
		}
		return head;
	}

}
