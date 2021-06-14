public class Solution {

	public static void print(int n){
		if(n == 0){
			// System.out.print(n + " ");
            return;
		}
		
		print(n - 1);
        System.out.print(n+" ");
	}

}
