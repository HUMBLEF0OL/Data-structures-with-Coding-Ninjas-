/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/
import java.util.*;

public class Solution {
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head)
	{
		if(head.next == null || head == null)
			return head;
		LinkedListNode<Integer> reversedNode = reverse(head.next);
		LinkedListNode<Integer> temp = head.next;
		temp.next = head;
		temp = head;
		head.next = null;
		return reversedNode;
		
		
	}

	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
   		head = reverse(head);
        if(head.next == null)
		{
			head.data = head.data+1;
			if(head.data == 10)
			{
				head.data = 0;
				LinkedListNode<Integer> newNode = new LinkedListNode<>(1);
				head.next = newNode;
				newNode.next = null;
				
			}
			return head;
		}
        LinkedListNode<Integer> temp = head;
		int carry = 0;
		temp.data = temp.data + 1;
		if(temp.data == 10)
		{
			temp.data = 0;
			carry = 1;
		}
		temp = temp.next;
		while(temp.next!=null)
		{
			temp.data = temp.data+carry;
			if(temp.data==10)
			{
				temp.data = 0;
				carry = 1;
			}
			else {
				carry = 0;
			}
			temp = temp.next;
		}
		temp.data = temp.data+carry;
		if(temp.data == 10)
		{
			temp.data = 0;
			carry = 1;
		}
		else {
			carry = 0;
		}
		if(carry == 1)
		{
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(1);
			temp.next = newNode;
			newNode.next = null;
		}
        head = reverse(head);
		return head;
	}


}
