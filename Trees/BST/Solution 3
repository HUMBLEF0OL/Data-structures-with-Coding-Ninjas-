package BST;

import java.util.Arrays;

public class Assignment_3_Replace_with_Sum_of_greater_nodes {
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

	static int sum = 0;
	// RWS => replace with sum
	public static void RWS(BST_Node<Integer> root)
	{
		if(root == null)
			return;
		RWS(root.right);
		// original data of the root node
		int od = root.data;
		root.data+=sum;
		sum += od;
		RWS(root.left);
		
	}
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,7,8,9};
		Arrays.sort(arr);
		// now creating a tree from the sorted array
		BST_Node<Integer> root = BSTIsertion(arr);
		display(root);
		RWS(root);
		System.out.println("\n\n\n");
		display(root);
	}
}
