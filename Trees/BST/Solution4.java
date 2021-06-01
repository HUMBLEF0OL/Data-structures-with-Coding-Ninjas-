import java.util.*;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root == null)
            return null;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		ArrayList<LinkedListNode<Integer>> list = new ArrayList<>();
 		while(!q.isEmpty())
		{
			BinaryTreeNode<Integer> current = q.remove();
			if(head==null)
			{
				LinkedListNode<Integer> newNode = new LinkedListNode<>(current.data);
				head = newNode;
				tail = newNode;
			}
			else {
				LinkedListNode<Integer> newNode = new LinkedListNode<>(current.data);
				tail.next = newNode;
				tail = newNode;
			}
			// inserting children in queue
			if(current.left!=null)
				q.add(current.left);
			if(current.right!=null)
				q.add(current.right);
			if(q.peek() == null)
			{
				if(q.size() == 1)
				{
					list.add(head);
					break;
				}
				else {
					list.add(head);
					head = null;
					tail = null;
					q.add(q.remove());
				}
			}
		}
 		return list;
	}

}
