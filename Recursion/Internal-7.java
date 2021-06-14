
public class Solution {

	public static int lastIndex(int input[], int x) {
		int index = input.length-1;
        while(index>=0)
        {
            if(x == input[index])
                return index;
            index--;
        }
        return -1;
	}
	
}
