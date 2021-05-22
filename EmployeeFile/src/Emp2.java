public class Emp2 {
	private int empID;
	public int getempID()
	{
		return empID;
	}
	public void setEmpId(int empId)
	{
		this.empID = empID;
	}
	public static void main(String[] args) {
		Emp2 emp=new Emp2();
		emp.setEmpId(12);
		System.out.println(emp.getempID());	
	}
}
