public class EmpFile 
{ 
		String name;
		int empId;
		 EmpFile()
		 {
			 System.out.println("Default constructor");
		 }
		  EmpFile(String name,int empId)
		 {
			 this.name=name;
			 this.empId=empId;
		 }
		 public static void main(String[] args)
		 {
			 EmpFile em=new EmpFile("raj",123);
			 System.out.println("Employee name is " +em.name);
			 System.out.println("EmpId is " +em.empId);
		 }
	}
