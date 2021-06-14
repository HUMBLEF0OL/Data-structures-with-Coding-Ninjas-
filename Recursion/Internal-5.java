public class Solution {
	
	public static boolean checkNumber(int arr[], int value) {
		// base condition
		if(arr.length == 1)
		{
			if(arr[0] == value)
			{
				return true;
			}
			else {
				return false;
			}
		}
		if(value == arr[0])
		{
			return true;
		}
		
		int smallarray[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++)
		{
			smallarray[i-1] = arr[i];
		}
		// induction hypothesis
		boolean output = checkNumber(smallarray,value);
		return output;
		
	}
}
