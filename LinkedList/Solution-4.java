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

	public static void printReverse(LinkedListNode<Integer> head) {
		if(head == null)
			return;
		if(head.next == null) {
			System.out.print(head.data+ " ");
			return;
		}
		printReverse(head.next);
		System.out.print(head.data+" ");
		return;
	}

}
