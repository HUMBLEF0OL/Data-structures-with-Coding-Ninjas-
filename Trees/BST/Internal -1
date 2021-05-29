package BST;

import java.util.Scanner;

public class BST_searching {
	static Scanner s = new Scanner(System.in);
	public static BST_Node<Integer> takeInput(boolean isRoot,int data,boolean isLeft)
	{
		if(isRoot)
			System.out.println("Enter the value of root");
		else if(isLeft)
			System.out.println("Enter the left child of "+data);
		else
			System.out.println("Enter the right child of "+data);
		
		int value = s.nextInt();
		if(value == -1)
			return null;
		BST_Node<Integer> root = new BST_Node<>(value);
		root.left = takeInput(false,value,true);
		root.right = takeInput(false,value,false);
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
	// searching for a node in BST
	public static boolean search(BST_Node<Integer> root, int value)
	{
		if(root == null)
            return false;
        if(root.data == value)
            return true;
        // checking for left side of the tree
        
        else if(value < root.data)
        {
        	return search(root.left,value);
        }
        // searching in the right of the tree
        else{
        	return search(root.right,value);
        }
	
	}
	public static void main(String[] args) {
		BST_Node<Integer> root = takeInput(true,0,false);
		display(root);
		System.out.println(search(root,5));
	}
}
