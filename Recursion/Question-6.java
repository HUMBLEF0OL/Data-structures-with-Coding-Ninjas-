
public class solution {

	public static int convertStringToInt(String str){
		if(str.length() == 1)
		{
			int temp = Integer.valueOf(str);
			return temp;
		}
		int smallOutput = convertStringToInt(str.substring(1));
		int temp = str.charAt(0) - 48;
		int result = (int) (temp*Math.pow(10,str.length()-1));
		return result+smallOutput;

	}
}
