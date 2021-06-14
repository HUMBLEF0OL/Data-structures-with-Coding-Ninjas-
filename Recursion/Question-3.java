
public class solution {

	public static int sumOfDigits(int number){
		if(number<=0)
		{
			return 0;
		}
		int smallOutput = number%10+sumOfDigits(number/10);
		return smallOutput;

	}
}
