
public class Pattern3 {

	public static void main(String[] args) {
		int rows=4;
	    for(int line = 1; line <= rows; line++) 
         {
	     	for(int space = 1; space <= rows-line; space++) 
		       {
                	System.out.print("  ");
            	}
            	for(int position = line; position <= 2*line-1; position++)
            	{
                	System.out.print("* ");
            	}
             System.out.println();
           }

	}

}
