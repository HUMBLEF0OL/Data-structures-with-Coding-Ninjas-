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
	public static boolean isBST(BinaryTreeNode<Integer> root,int max,int min)
	{
		if(root == null)
			return true;
		if(root.data > max || root.data < min)
			return false;
		boolean leftSide = isBST(root.left,root.data-1,min);
		boolean rightSide = isBST(root.right,max,root.data);
		return leftSide && rightSide;
	}
	// finding the height of the given tree
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root == null)
			return 0;
		if(isBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE))
		{
			return height(root);
		}
		return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
	}

}
