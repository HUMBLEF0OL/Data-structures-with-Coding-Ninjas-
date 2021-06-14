
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		if(m == 0)
		{
			return 0;
		}
		int smallOutput = n + multiplyTwoIntegers(m-1,n);
		return smallOutput;
	
	}
}
