/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int index){
		LinkedListNode<Integer> temp = head;
		int counter = 0;
		while(temp!=null)
		{
			if(counter == index)
			{
				System.out.println(temp.data);
				return;
			}
			counter++;
			temp = temp.next;
		}
		// System.out.println(-1);
		return;
	}
}
