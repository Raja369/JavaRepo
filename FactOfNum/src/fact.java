
public class fact {
	public int fact(int n)
  	{
       		int factorial;
       		if(n==1)
		{
         		return 1;
      		}
       		factorial = fact(n-1)* n;
       		return factorial;
   	 }
}
