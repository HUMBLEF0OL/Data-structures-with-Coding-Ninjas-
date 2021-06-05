import java.util.*;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
       if(arr.length == 0)
			return 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		int max = -1;
		int sum = 0;
		int secondary = 0;
        // special case -> when the sum of the whole array is 0
		for(int i: arr)
		{
			secondary+=i;
		}
		if(secondary == 0)
			return arr.length;
		for(int i=0;i<arr.length;i++)
		{
			
			sum+=arr[i];
			if(map.containsKey(sum))
			{
//				map.put(sum, i)
				int temp = i-map.get(sum);
				if(temp>max)
					max = temp;
			}
			else {
				map.put(sum,i);
			}
			if(sum == 0)
			{
				// go back
				int j = i-1;
				int counter = 1;
				int tempSum = arr[i];
				while(j>=0)
				{
					if(tempSum == 0)
						break;
					tempSum+=arr[j];
					j--;
					counter++;
				}
				
				if(counter>max)
					max = counter;
			}
		}
		return max;
	}
}
