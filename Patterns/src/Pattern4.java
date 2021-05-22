
public class Pattern4 {

	public static void main(String[] args) {
		int rows = 5, line, position, space = 1;

	       space = rows-1;

	        for (line = 1; line <= rows; line++) 
	        {
	            for (position = 1; position <= space; position++) 
	             {
	                System.out.print(" ");
	             }

	           space--;

	            for (position = 1; position <= line-1 ; position++) 
	             {
	                System.out.print("*");                
	             }

	            System.out.println("");
	        }

	        space = 1;

	        for (line = 1; line <= rows - 1; line++) 
	        {
	            for (position = 1; position <= space; position++) 
	             {
	                System.out.print(" ");
	             }

	           space++;

	            for (position = 1; position <= (rows - line)-1; position++) 
	             {
	                System.out.print("*");
	             }
	            System.out.println("");
	        }

	}

}
