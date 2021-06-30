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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		if (head == null)
			return head;
		// creating the copy of the original list
		
		LinkedListNode<Integer> temp = head;	// variable to the original list

		LinkedListNode<Integer> h1 = null, t1 = null,h2 = null, t2 = null;
		while (temp != null) {
			// checking for odd elements
			if(temp.data %2 != 0)
			{
				if(h1 == null)
				{
					h1 = temp;
					t1 = temp;
					temp = temp.next;
					continue;
				}
				t1.next = temp;
				t1 = temp;
				temp = temp.next;
			}
			// checking for even elements
			else if(temp.data % 2 == 0){
				if(h2 == null)
				{
					h2 = temp;
					t2 = temp;
					temp = temp.next;
					continue;
				}
				t2.next = temp;
				t2 = temp;
				temp = temp.next;
			}
			
		}
		// checking for validity
		if(h1 != null && h2 != null)
		{
			t1.next = h2;
			t2.next = null;
			return h1;
		}
		else if(h1 == null && h2 !=null){
			t2.next = null;
			return h2;
		}
		else {
			t1.next = null;
			return h1;
		}
	}
}
