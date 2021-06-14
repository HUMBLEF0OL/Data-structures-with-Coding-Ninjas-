
public class solution {

	// Return the updated string
	public static String addStars(String str) {
		if(str.length() == 1)
		{
			return str;
		}
		String smallOutput = addStars(str.substring(1));
		if(str.charAt(0) == smallOutput.charAt(0))
		{
			return (str.charAt(0)+"*"+smallOutput);
		}
		else {
			return (str.charAt(0)+smallOutput);
		}

	}
}
