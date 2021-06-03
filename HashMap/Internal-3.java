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
		
		if(arr.length == 0)
			return;
		HashMap<Integer,Integer> map = new HashMap<>();
		int counter = 0;
		// finding all the pairs in the single pass
		int zero = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				zero++;
				continue;
			}
			if(map.containsKey(arr[i]))
			{
				int value = map.get(arr[i]);
				map.put(arr[i],value+1);
			}
			else
				map.put(arr[i], 1);
			if(map.containsKey(-arr[i]))
				counter+=map.get(-arr[i]);
		}
		counter = counter+((zero-1)*zero)/2;
		System.out.println(counter);
        return counter;
	}
}
