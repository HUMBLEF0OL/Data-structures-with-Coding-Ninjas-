import java.util.*;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
		// Write your code here
        // for reversing the element of the queue(i.e max element will be popped now)
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            q.add(arr[i]);
        }
        
        for(int i=k;i<arr.length;i++)
        {
            int max = q.peek();
            if(arr[i]<max)
            {
                q.remove();
                q.add(arr[i]);
            }
        }
        while(!q.isEmpty())
        {
            list.add(q.remove());
        }
        Collections.reverse(list);
        return list;
        
	}
}
