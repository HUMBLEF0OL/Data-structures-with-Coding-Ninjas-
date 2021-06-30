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
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		while(fast.next != null)
		{
			if(fast.next.next == null)
			{
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
    }

}
