public class Solution {

	public static int count(int number){
		if(number <= 0)
		{
			return 0;
		}
		int small = count(number/10);
		return small+1;
	}

}
