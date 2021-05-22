
public class CheckNum {

	public static void main(String[] args) {
		float num = 100;
		
		if( num == 0)
		{
			System.out.println("Zero");
		}
		else if ( num > 0)
		{
			System.out.println( "Positive");
		}
		else
		{
			System.out.println( "Negative");
		}
		if ( num < 1)
		{
			System.out.println( "small");
		}
		else if ( num > 1000000)
		{
			System.out.println( " Large ");
		}

	}

}
