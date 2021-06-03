import java.util.*;
public class Solution {
/*
  	naive algorithm will take
  	TIME COMPLEXITY => O(n^2)
  	SPACE COMPLEXITY => O(1)
  	
  	USING HASHMAP THE COMPLEXTIY IS REDUCED TO
  	
  	TIME COMPLEXITY => O(n)
  	SPACE COMPLEXITY => O(n)
 */
	public static void printIntersection(int[] a1,int[] a2){
	// using hash-map for finding the intersection
	/*
	 	-> save the frequency of array-1 
	 	-> now check whether hash-map contains the value of array-2
	 	-> if present, then print and decrement the value of values in hash map by 1
	 */
	if(a1.length == 0 || a2.length == 0)
			return;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i= 0;i<a1.length;i++)
		{
			if(map.containsKey(a1[i]))
				map.put(a1[i],map.get(a1[i])+1);
			else {
				map.put(a1[i],1);
			}
		}
		for(int i=0;i<a2.length;i++)
		{
			if(map.containsKey(a2[i]))
			{
				if(map.get(a2[i]) == 0)
					continue;
				else {
					System.out.println(a2[i]);
					map.put(a2[i], map.get(a2[i])-1);
				}
			}
		}
	}
}
