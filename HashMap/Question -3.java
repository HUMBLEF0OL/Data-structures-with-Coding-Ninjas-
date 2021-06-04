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
	// the time  complexity of this method is O(nlogn);
	public static void method2(int arr[],int k)
	{
		
		Arrays.sort(arr);
		if(arr[0] == arr[arr.length-1])
		{
			int value = (arr[0]*(arr[0]-1))/2;
			System.out.println(value);
			return ;
		}
		int i =0;
		int j =0;
		int count = 0;
		while(i<arr.length-1)
		{
			if(arr[j]-arr[i]==k)
			{
				i++;j++;
				count++;
			}
			else if(arr[j]-arr[i]<k)
			{
				j++;
			}
			else
				i++;
			if(i==arr.length-1 || j== arr.length)
				break;
		}
		System.out.println(count);
	}
}
