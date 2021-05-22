
public class Series3 {

	public static void main(String[] args) {
		int num = 1, endpoint = 12;
		while( num <= endpoint)
		 {
			if( num % 2 != 0)
			{
				System.out.print( (num + 1) / 2 + " ");
			}
			else
			{
				System.out.print( num - 1 + " ");
			}
			num++;
		 }

	}

}
