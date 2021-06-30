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
	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> h1, LinkedListNode<Integer> h2)
	{
		if(h1 == null || h2 == null)
			return null;
		if(h1 == null)
			return h2;
		if(h2 == null)
			return h1;
		LinkedListNode<Integer> head = null,tail = null;
		LinkedListNode<Integer> t1 = h1,t2 = h2;
		if(t1.data<= t2.data)
		{
			head = t1;
			t1 = t1.next;
		}
		else {
			head = t2;
			t2 = t2.next;
		}
		tail = head;
		while(t1!=null && t2!=null)
		{
			if(t1.data<=t2.data)
			{
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}
			else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		if(t1==null)
			tail.next = t2;
		else {
			tail.next = t1;
		}
		return head;
		
	}
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
// base condition
		if(head == null)
			return null;
		if( head.next == null)
			return head;
		LinkedListNode<Integer> mid = midPoint(head);
		LinkedListNode<Integer> h1 = head;
		LinkedListNode<Integer> h2 = mid.next;
		mid.next = null;
		h1 = mergeSort(h1);
		h2 = mergeSort(h2);
		head = merge(h1,h2);
		return head;
    }

}
