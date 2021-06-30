
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	private int data[];
    private int counter;
    private int maxIndex;
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    public Polynomial()
    {
        data=new int[5];
        counter=0;
        maxIndex=5;
    }
     public int size()
    {
      return counter+1;
    }
    
    public int get(int index)
    {
        return data[index];
    }
        
    public void copyElements(int index)
    {
        int[] temp=data;
        data=new int[index+1];        
        for(int i=0;i<maxIndex;i++)
        {
            data[i]=temp[i];
        }
        maxIndex=index+1;
    }
	public void setCoefficient(int index, int coeff){
	
	if(index>=maxIndex && index>counter)
        {
            copyElements(index);
        }
            data[index]=coeff;
            if(counter<index)
                counter=index;	
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<=counter;i++)
        {
            if(data[i]!=0)
            {
                System.out.print(data[i]+"x"+i+" ");
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
	if(this.size()<p.size()||p.size()<this.size())
        {
            if(this.size()<p.size())
            {
                this.setCoefficient(p.size()-1,0);
            }
            else
            {
                p.setCoefficient(this.size()-1,0);
            }
        }
        for(int i=0;i<this.size();i++)
        {
            this.setCoefficient(i,this.get(i)+p.get(i));
        }
        return this;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
if(this.size()<p.size() || p.size()<this.size())
        {
            if(this.size()<p.size())
            {
                this.setCoefficient(p.size()-1,0);
            }
            else
            {
                p.setCoefficient(this.size()-1,0);
            }
        }
        for(int i=0;i<this.size();i++)
        {
            this.setCoefficient(i,this.get(i)-p.get(i));
        }
        return this;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial p1=new Polynomial();
        p1.setCoefficient(this.size()+p.size(),0);
        for(int i=0;i<this.size();i++)
		{
			for(int j=0;j<p.size();j++)
			{
				if(this.get(i)!=0)
				{
					if(p.get(j)!=0)
					{
						int num=p1.get(i+j);
						p1.setCoefficient(i+j,this.get(i)*p.get(j));
						int result=num+p1.get(i+j);
						p1.setCoefficient(i+j, result);
					}
				}
				else
					break;
			}
		}
		return p1;
	}

}
