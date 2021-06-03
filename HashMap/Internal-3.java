import java.util.*;

public class Solution {
	public static int PairSum(int[] arr, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
       if(arr.length == 0)
			return 0;
		
		int pairCounter = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		// storing the frequency of the elements in the hash-map
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);
		}
		// finding the pairs
		
		Set<Integer> keys = map.keySet();
		int temp = 0;
		for(int i:keys)
		{
			if(map.containsKey(-i))
			{
				if(i == 0)
				{
					int values = map.get(0);
					if(values > 1)
					{
						pairCounter = ((values-1)*values)/2;
					}
				}
				else
					temp+=(map.get(i)*map.get(-i));
			}
		}
		pairCounter+=temp/2;
        return pairCounter;
	}
}
