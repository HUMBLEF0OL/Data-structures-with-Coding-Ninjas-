public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
		public static BinaryTreeNode<Integer> BSTIsertion(int arr[],int start, int end)
        {
            if(start > end)
                return null;

            // calling the function on the left and right side of the array
            // creating half arrays for each side
            int mid = (start + end)/2;
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
            root.left = BSTIsertion(arr,start,mid-1);
            root.right = BSTIsertion(arr,mid+1,end);
            return root;
        }
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			BinaryTreeNode<Integer> root = BSTIsertion(arr,0,n-1);
            return root;
		}
	}
