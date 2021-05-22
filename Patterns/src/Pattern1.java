
public class Pattern1 {

	public static void main(String[] args) {
		int rows = 5;
		for(int line = 1; line <= rows; line++)
		{
			for(int num = 1;num <= line; num++)
			{
				System.out.print(num + " ");	
			}
			System.out.println();
		}
	}

}
