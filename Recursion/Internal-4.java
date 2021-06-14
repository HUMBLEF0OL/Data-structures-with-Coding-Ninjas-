public class Solution {

	public static int sum(int arr[]) {
				// base condition
		if(arr.length == 1)
		{
			return arr[0];
		}
		int smallarray[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			smallarray[i-1] = arr[i];
		}
		int sum = arr[0] + sum(smallarray);
		return sum;
		
	}
}
