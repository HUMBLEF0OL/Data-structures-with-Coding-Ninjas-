
public class solution {

	// Return the changed string
	public static String removeX(String str){
		// base condition
		if(str.length() == 0)
		{
			String newTemp = "";
			return newTemp;
		}
		// induction step
		String smallOutput = removeX(str.substring(1));
		if(str.charAt(0) == 'x')
		{
			return smallOutput;
		}
		else {
			return str.charAt(0)+smallOutput;
		}

	}
}
