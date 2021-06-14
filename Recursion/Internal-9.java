public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		if(str.length() == 1)
		{
			return str;
		}
		String smallOutput = removeConsecutiveDuplicates(str.substring(1));
		if(str.charAt(0) == smallOutput.charAt(0))
		{
			return smallOutput;
		}
		else {
			return str.charAt(0) + smallOutput;
		}

	}

}
