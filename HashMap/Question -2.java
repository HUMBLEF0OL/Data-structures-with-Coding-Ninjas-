import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        		HashMap<Integer,Boolean> map = new HashMap<>();
		// first loop for pushing elements in the map
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				continue;
			else{
				map.put(arr[i],true);
			}
		}
		// second loop for inverting those elements which have a consecutive smaller
		// element then them
		for(int i=0;i<arr.length;i++)
		{

			if(map.containsKey(arr[i]-1))
				map.put(arr[i], false);
		}


		// third loop for finding the longest consecutive sub-array
		int max = 0;
		int start = -1;
		int end = -1;
		int j = 0;
		// Set<Integer> keys = map.keySet();
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])==true)
			{
				int tempLen = 0;
				int t2 = arr[i];
				while(map.containsKey(t2+tempLen))
					tempLen++;
				if(tempLen>max)
				{
					max = tempLen;
					start = arr[i];
					end = start+tempLen-1;
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(start);
		list.add(end);
		return list;
    }
}
