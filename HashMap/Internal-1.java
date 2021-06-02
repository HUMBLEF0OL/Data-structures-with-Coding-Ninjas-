import java.util.*;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
        if(arr.length == 0)
            return -1;
		int maxFreq = Integer.MIN_VALUE;
		int number = arr[0];
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		// using set data structure
		Set<Integer> keySet = map.keySet();
		for(Integer i:keySet)
		{
			if(map.get(i) > maxFreq)
			{
				number = i;
				maxFreq = map.get(i);
			}
		}
		return number;
    }
}

