import java.util.ArrayList;
import java.util.*;

public class solution {

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

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
        // Write your code here
        if(root == null)
            return false;
        if(root.left != null && root.right != null)
            if(root.left.data == p && root.right.data == q)
                return false;
        Queue<BinaryTreeNode<Integer>> Q = new LinkedList<>();
        Q.add(root);
        Q.add(null);
        int swt = 0;
        int sameParent = 0;
        while(!Q.isEmpty())
        {
            BinaryTreeNode<Integer> temp = Q.remove();
            sameParent = 0;
            if(temp == null)
            {
                if(!Q.isEmpty())
                {
                    swt = 0;
                    Q.add(null);
                }
            }
            else 
            {
                if(temp.left != null)
                {
                    if(temp.left.data == p || temp.left.data == q)
                    {
                        if(swt == 1 && sameParent == 0)
                            return true;
                        if(swt == 0 && sameParent == 0)
                        {
                            swt = 1;
                            sameParent =1;
                        }
                        else
                            return false;
                    }
                    Q.add(temp.left);
                }
                if(temp.right != null)
                {
                    if(temp.right.data == p || temp.right.data == q)
                    {
                        if(swt == 1 && sameParent == 0)
                            return true;
                        if(swt == 0 && sameParent == 0)
                        {
                            swt = 1;
                            sameParent = 1;
                        }
                        else
                            return false;
                    }
                    Q.add(temp.right);
                }
            }
        }
        return false;
	}
}
