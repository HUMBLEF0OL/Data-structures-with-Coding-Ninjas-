package BST;

import java.util.Arrays;

public class Assignment_2_lowest_common_ancestor {
	public static BST_Node<Integer> BSTIsertion(int arr[])
	{
		if(arr.length == 0)
			return null;
		BST_Node<Integer> root = new BST_Node<>(arr[(arr.length)/2]);
		// calling the function on the left and right side of the array
		// creating half arrays for each side
		int mid = arr.length/2;
		int a1[] = new int[mid];
		for(int i=0;i<mid;i++)
		{
			a1[i] = arr[i];
		}
		int a2[] = new int[arr.length-mid-1];
		for(int i = mid+1;i<arr.length;i++)
		{
			a2[i-mid-1] = arr[i];
		}
		BST_Node<Integer> left = BSTIsertion(a1);
		BST_Node<Integer> right = BSTIsertion(a2);
		
		root.left = left;
		root.right = right;
		return root;
		
	}
	public static void display(BST_Node<Integer> root)
	{
		if(root == null)
			return;
		String str = root.data+" : ";
		if(root.left!=null)
			str = str+"L=> "+root.left.data;
		if(root.right!=null)
			str = str+"R=> "+root.right.data;
		System.out.println(str);
		display(root.left);
		display(root.right);
	}
	// function for finding the lowest common ancestor
	
	public static int LCA(BST_Node<Integer> root, int n1, int n2)
	{
		if(root == null)
			return -1;
		int result = 0;
		// when root becomes greater than both n1 and n2 then search on the left side of tree
		if(root.data > Math.max(n1, n2))
			result = LCA(root.left,n1,n2);
		// when root becomes less than both n1 and n2 so w will search on right side of the tree
		else if(root.data < Math.min(n1, n2))
			result = LCA(root.right,n1,n2);
		// else we are standing at the root
		else {
			return root.data;
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {5,4,7,2,3,1,90};
		Arrays.sort(arr);
		// now creating a tree from the sorted array
		BST_Node<Integer> root = BSTIsertion(arr);
		display(root);
		System.out.println(LCA(root, 1,90));
	}
}
