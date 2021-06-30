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
		public static int length(LinkedListNode<Integer> head) {
		int counter = 0;
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		int l = length(head)-1;
		if((l+1)<=1)
			return true;
		int mid = 0;
		LinkedListNode<Integer> t = head;
		int arr[];
		if(l%2==0)
		{
			mid = l/2;
			arr = new int[mid];
			int counter = 0;
			while(t!=null)
			{
				if(counter>=mid+1)
				{
					arr[counter-(mid+1)] = t.data;
				}
				counter++;
				t = t.next;
			}
		}
		else {
			mid = (l/2)+1;
			arr = new int[mid];
			int counter = 0;
			
			while(t!=null)
			{
				if(counter>=mid)
				{
					arr[counter-mid] = t.data;
				}
				counter++;
				t = t.next;
			}
		}
		t = head;
		for(int i =arr.length-1;i>=0;i--)
		{
			if(t.data!=arr[i])
			{
				return false;
			}
			t = t.next;
		}
		return true;
	}

}
