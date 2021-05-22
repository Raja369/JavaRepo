import java.io.IOException;
public class StudentEx {
	public static void main(String[] args) {
		  ManageStudent ms = new ManageStudent();
          ms.addStudent(1, "raj", "Hyd");
          ms.addStudent(2, "ram", "Bng");
          ms.addStudent(13, "rak", "delhi");
          ms.addStudent(15, "jitin", "Bng");
        try {
        	String ex = ms.searchStudent("rahul");
			System.out.println(ex);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("Exception occured");
		}
			 ms.searchByCity("Bng");
	}
}
