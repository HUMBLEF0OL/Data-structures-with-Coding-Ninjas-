import java.util.ArrayList;

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
		public static int height(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static ArrayList<Integer> path(BinaryTreeNode<Integer> root, int height,ArrayList<Integer> list)
	{
		if(root == null)
		{
			return null;
		}
		if(height == 1)
		{
			list.add(root.data);
			return list;
		}
		ArrayList<Integer> left = path(root.left,height-1,list);
		if(left != null)
		{
			left.add(root.data);
			return left;
		}
		ArrayList<Integer> right = path(root.right,height-1,list);
		if(right != null)
		{
			right.add(root.data);
			return right;
		}
		return null;
	}
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
		// base case
		if(root == null)
			return null;
		// first find the height of the tree
		// then store the longest path(using the height) in a string 
		// then string -> char array -> array-list
		int height = height(root);
		ArrayList<Integer> list = new ArrayList<>();
		list = path(root,height,list);
		return list;
	}

	
	
}
