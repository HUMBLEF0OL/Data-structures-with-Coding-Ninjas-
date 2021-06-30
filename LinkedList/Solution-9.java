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

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
	if((i == 0 && j == 0) || (i == j))
			return head;
		LinkedListNode<Integer> t1 = head, t2 = head, ith = null, jth = null;
		LinkedListNode<Integer> temp = null;
		//when either i or j is 0
			// when swapping in between 
			// finding the correct index for ith node
			while(i>1)
			{
				i--;
				t1 = t1.next;
			}
			ith = t1.next;
			// finding the correct index for the jth node
			while(j>1)
			{
				j--;
				t2 = t2.next;
			}
			jth = t2.next;
        	if(ith == t2 || jth == t1)
			{
				ith.next = jth.next;
				t1.next = jth;
				jth.next = ith;
				return head;
			}
			temp = jth.next; 
			// linking the nodes at the right index
			jth.next = t1.next.next;
			t1.next = jth;
			
			ith.next = temp;
			t2.next = ith;
//			System.out.println("t2.next => "+t2.next.data);
//			System.out.println("next of jth is => "+jth.next.data);
//			System.out.println("next of ith is => "+ith.next.data);
			return head;
    }
}
