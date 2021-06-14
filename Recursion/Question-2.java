
public class solution {
	public static boolean palindrome(String str,int start,int end)
	{
		if(start > end)
		{
			return true;
		}
		else {
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			
			boolean result = palindrome(str,start+1,end-1);
			return result;
			
		}
	}
	public static boolean isStringPalindrome(String input) {
		boolean result = palindrome(input,0,input.length()-1);
        return result;

	}
}
