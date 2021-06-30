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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> h1, LinkedListNode<Integer> h2) {
// defining the corner conditions
		
		if(h1 == null && h2 == null)
			return null;
		if(h1 == null)
			return h2;
		if(h2 == null)
			return h1;
		
		// head and tail for the resultant list
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		LinkedListNode<Integer> l1 = h1;
		LinkedListNode<Integer> l2 = h2;
		if(l1.data <=l2.data)
		{
			head = l1;
			l1 = l1.next;
		}
		else {
			head = l2;
			l2 = l2.next;
		}
		tail = head;
		while(l1!=null && l2!=null)
		{
			if(l1.data <= l2.data)
			{
				tail.next = l1;
				tail = l1;
				l1 = l1.next;
			}
			else {
				tail.next = l2;
				tail = l2;
				l2 = l2.next;
			}
		}
		if(l1==null)
		{
			tail.next = l2;
		}
		else {
			tail.next = l1;
		}
		return head;
    }

}
