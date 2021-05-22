
public class Series4 {

	public static void main(String[] args) {
		int lastterm = 100, firstterm = 1, secondterm =1;
        while (firstterm <= lastterm)
        {
    		System.out.print( firstterm + "  ");
            int thirdterm = firstterm + secondterm;
    		firstterm = secondterm;
            secondterm = thirdterm;
        }
	}

}
