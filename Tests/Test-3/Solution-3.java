public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(root == null)
			return null;
		// when there are no children of the given root
		if(root.children.size()==0)
			return null;
		for(int i = 0;i<root.children.size();i++)
		{
			TreeNode<Integer> temp = removeLeafNodes(root.children.get(i));
			if(temp == null)
			{
				root.children.remove(i);
				i--;
			}
		}
		return root;
	}
}
