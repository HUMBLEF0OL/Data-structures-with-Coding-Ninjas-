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
		if(head==null || head.next==null)
        		return head;
		LinkedListNode<Integer> temp1 = head;

		    while(temp1.next!=null)
		    {
			if(temp1.data.equals(temp1.next.data))
			{
			    temp1.next= temp1.next.next;

			} 
			else
				temp1= temp1.next;
		    } 

		return head;
	}

}
