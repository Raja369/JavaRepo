
public class Pattern2 {

	public static void main(String[] args) {
		 int num=1, rows = 5;
			for(int line = 1;line < rows; line++)
			{
				for(int position = 1; position <= line; position++)
				{
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}

	}

}
