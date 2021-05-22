import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
public class ManageStudent 
{
	Student[] allStudents = new Student[30];
	int count = allStudents.length;
	ArrayList<Student> list=new ArrayList<Student>();
	
	public ManageStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Student> addStudent(int studNo, String name, String city) {
			list.add(new Student(studNo, name, city));
		
		return list;
	}
	public String searchStudent(String name) throws IOException {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				return name;
			} else {
				throw new IOException();
			}
			}
		return null;
		}	
	public void searchByCity(String name) {
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getCity().equals(name)) {
				System.out.println(list.get(i).getName());
			}
		}
	}
	}