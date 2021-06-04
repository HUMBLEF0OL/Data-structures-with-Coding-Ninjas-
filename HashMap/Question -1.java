import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
	char arr[] = str.toCharArray();
       String output = "";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				continue;
			else
            {
                output+=arr[i];
                map.put(arr[i], 1);
            }
				
		}
        return output;
	}
}
