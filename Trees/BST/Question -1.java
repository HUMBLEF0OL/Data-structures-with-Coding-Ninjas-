public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
	if(root == null)
			return null;
		LinkedListNode<Integer> newHead = constructLinkedList(root.left);
		LinkedListNode<Integer> temp = newHead;
		if(newHead == null)
			newHead = new LinkedListNode<>(root.data);
		else
		{			
			while(temp != null && temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new LinkedListNode<>(root.data);
		}
		LinkedListNode<Integer> rightHead = constructLinkedList(root.right);
		if(newHead.next == null)
			newHead.next = rightHead;
		else
			temp.next.next = rightHead;
		return newHead;
	}
}
