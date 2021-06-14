public class Solution {

	public static int power(int base, int p) {

	// base condition
		if(p == 0)
		{
			return 1;
		}
		// induction hypothesis
		int small = power(base, p-1);
		// induction step
		int output = small * base;
		return output;		
	}
}
