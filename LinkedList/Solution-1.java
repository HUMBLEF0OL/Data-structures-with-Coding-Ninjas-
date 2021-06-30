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
    public static int length(LinkedListNode<Integer> head) 
    {
        int counter = 0;
        LinkedListNode<Integer> temp = head;
        while (temp != null) 
        {
            counter++;
            temp = temp.next;
        }
        return counter;
    }
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int index) 
    {
        int l = length(head);
        // when the index exceed the list indexes
        if(index > l-1)
            return head;
        // deleting the first element
        if (index == 0) 
        {
            head = head.next;
            return head;
        }
        // deleting the last index
        else if (index == l - 1) 
        {
            LinkedListNode<Integer> temp = head;
            while (index > 1) 
            {
                index--;
                temp = temp.next;
            }
            temp.next = null;
            // tail = temp;
            return head;
        }
		// deleting intermediate
            int counter = 0;
            LinkedListNode<Integer> temp = head;
            while (counter != index - 1 && temp != null) 
            {
                counter++;
                temp = temp.next;
            }
            if (temp != null) 
            {
                temp.next = temp.next.next;
            }
            return head;
    }
}
