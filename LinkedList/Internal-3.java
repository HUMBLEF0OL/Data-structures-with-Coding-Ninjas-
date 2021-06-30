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
			int count = 0;
			LinkedListNode<Integer> temp = head;
			while(temp!=null)
			{
				temp = temp.next;
				count++;
			}
			return count;
		}
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int index, int value){
			int length = length(head);
			if(index>length)
				return head;
			LinkedListNode<Integer> temp = new LinkedListNode<>(value);
			if(index == 0)
			{
				temp.next = head;
				head = temp;
			}
			else {
				LinkedListNode<Integer> t = head;
				int counter = 0;
				while(counter!=index-1)
				{
					t = t.next;
					counter++;
				}
				temp.next = t.next;
				t.next = temp;
			}
			return head;
	}
}
