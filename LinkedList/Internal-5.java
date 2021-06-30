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


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int index) {
		if(head == null && index>=0)
			return head;
		if(index == 0)
			return head.next;
		head.next = deleteNodeRec(head.next,index-1);
		return head;
	}

}
