
public class solution {

	public static double findGeometricSum(int k){
		if(k==0)
		{
			return 1;
		}
		double answer = 1/Math.pow(2, k)+ findGeometricSum(k-1);
		return answer;

	}
}
