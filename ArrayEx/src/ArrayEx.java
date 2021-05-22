public class ArrayEx {
	public void print(String... a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
	}
	public static void main(String[] args) {
		ArrayEx e4=new ArrayEx();
		e4.print("How are u", "Hello");
}
}
