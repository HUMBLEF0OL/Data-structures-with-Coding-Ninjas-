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
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head)
	{
		// base condition
		if(head == null)
			return null;
		if(head.next == null)
			return head;
		LinkedListNode<Integer> smallOutput = reverse(head.next);
		LinkedListNode<Integer> temp = head.next;
		temp.next = head;
		head.next = null;
		return smallOutput;
	}

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(head == null || head.next == null || k == 0)
			return head;
		LinkedListNode<Integer> temp = head;
		int tempk = k-1;
		while(temp != null && tempk != 0)
		{
			tempk--;
			temp = temp.next;
		}
		LinkedListNode<Integer> head2;
		if(temp != null)
		{
			head2 = temp.next;
			temp.next = null;
		}
		else
		{
			head2 = null;
		}
		LinkedListNode<Integer> newHead = reverse(head);
		LinkedListNode<Integer> restHead = kReverse(head2,k);
		temp = newHead;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = restHead;
		return newHead;	
	}

}
