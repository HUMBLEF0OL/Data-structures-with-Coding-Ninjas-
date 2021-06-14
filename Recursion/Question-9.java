
public class Solution {
	
		
public static int staircase(int n){

	if(n <= 1 )
    {
        return 1;
    }
    else if(n == 2)
    {
        return 2;
    }
    else if( n ==3)
    {
        return 4;
    }
    else{
        return staircase(n-3)+staircase(n-2)+staircase(n-1);
    }
}
        
    
}
