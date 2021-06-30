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


	public static int findNodeRec(LinkedListNode<Integer> head, int value) {
		if(head == null)
		{
			return -1;
		}
		if(head.data == value)
		{
			return 0;
		}
		int smallOutput = 1+findNodeRec(head.next,value);
		if(smallOutput == 0)
			return -1;
		else
			return smallOutput;
	}

}
