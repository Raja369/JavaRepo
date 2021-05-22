public class Emp1 {
	private int empId;
	private String empName;
	private static int empCount = 100;
	public static int increment() {
		empCount++;
		return empCount;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Emp1() {
		System.out.println("default constructor");
	}	
		public Emp1(int empID, String empName ) {
		this.empId = empID;
		this.empName = empName;
		System.out.println("employee ID is " + this.empId);
		System.out.println("employee Name is " + this.empName);
	}
		public void printEmpID() {
		System.out.println("emp id is " + getEmpId());
	}
		public void VarPrint(String... str) {
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}