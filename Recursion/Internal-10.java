public class solution {
	public static void Merge(int a1[],int a2[],int input[])
    {
        int i=0,j=0,k=0;
        int n1 = a1.length;
        int n2 = a2.length;
        while(i<n1 && j<n2)
        {
            if(a1[i] <= a2[j])
            {
                input[k] = a1[i];
                k++;
                i++;
            }
            else{
                input[k] = a2[j];
                k++;
                j++;
            }
        }
        while(i<n1)
        {
            input[k] = a1[i];
                k++;
                i++;
        }
        while(j<n2)
        {
             input[k] = a2[j];
                k++;
                j++;
        }
    }
	public static void mergeSort(int[] input){
		if(input.length <=1)
        {
            return;
        }
        else{
            int []a1 = new int[input.length/2];
            int []a2= new int[input.length- a1.length];
            for(int i=0;i<input.length/2;i++)
            {
                a1[i] = input[i];
            }
            for(int i = input.length/2;i<input.length;i++)
            {
                a2[i-input.length/2] = input[i];
                
            }
            mergeSort(a1);
            mergeSort(a2);
            Merge(a1,a2,input);
        }
		
	}
}
