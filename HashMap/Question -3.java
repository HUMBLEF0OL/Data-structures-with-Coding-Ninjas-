import java.util.*;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
       if(arr.length == 0)
			return 0;
		// mapping the array values
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int prev = map.get(arr[i]);
				map.put(arr[i],prev+1);
			}
			else
				map.put(arr[i], 1);
		}
		int pairCounter = 0;
		// special case -> when all the elements are same
		if(map.size() == 1)
		{
			if(k == 0)
				return ((map.get(arr[0]))*(map.get(arr[0])-1))/2;
			else
				return 0;
		}
		for(int i= 0;i<arr.length;i++)
		{
			// int temp = k-arr[i];
			// int t2 = k+arr[i];
			// if(map.containsKey(temp))
			// {
			// 	pairCounter += map.get(temp)*map.get(arr[i]);
			// }
			// if(map.containsKey(t2))
			// {
			// 	pairCounter += map.get(t2)*map.get(arr[i]);
			// }
			// // setting the frequency of arr[i] to 0
			// map.put(arr[i],0);
            if(map.containsKey(arr[i] - k) && k!=0 ) {

				pairCounter+=map.get(arr[i]-k);

			}
		}
		return pairCounter;
	}
}
