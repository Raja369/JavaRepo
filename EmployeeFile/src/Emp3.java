public class Emp3 {
	static int empCount=0;
	public static int Increment()
	{
		return empCount++;
	}
		public static void main(String[] args) {
		System.out.println( Emp3.Increment());
		Emp3 a=new Emp3();
		System.out.println(a.Increment());
		}
}
