
public class Solution {

	public static int firstIndex(int arr[], int number) {
	if(arr.length == 0)
    {
        return -1;
    }
    if(arr[0] == number)
    {
        return 0;
    }
        int smallArray[] = new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            smallArray[i-1] = arr[i];
        }
        int index = firstIndex(smallArray,number);
        if(index == -1)
            return -1;
    	else{
            return index+1;
        }
		
	}
	
}
