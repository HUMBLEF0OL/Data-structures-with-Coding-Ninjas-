import java.util.*;
public class solution {

	public static int maximumProfit(int arr[]) {
		Arrays.sort(arr);
        int count = arr.length;
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			int temp = (count--)*arr[i];
			if(temp>max)
			{
				max = temp;
			}
		}
		return max;

	}

}
