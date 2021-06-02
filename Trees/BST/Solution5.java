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
    private static ArrayList<Integer> secondary(BinaryTreeNode<Integer> root,ArrayList<Integer> list) {
		if(root == null)
		{
			return list;
		}
		// using in-order traversal
		secondary(root.left,list);
		list.add(root.data);
		secondary(root.right,list);
		return list;
		
		
	}
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
        if(root == null)
			return;
		ArrayList<Integer> list = new ArrayList<>();
		list = secondary(root,list);
		System.out.println();
		int i = 0;
		int j = list.size()-1;
		while(i<j)
		{
			if(list.get(i)+list.get(j) == k)
			{
				System.out.println(list.get(i)+" "+list.get(j));
				i++;
				j--;
			}
			else if(list.get(i)+list.get(j) < k)
				i++;
			else if(list.get(i)+list.get(j) > k)
				j--;
		}
	}

}
