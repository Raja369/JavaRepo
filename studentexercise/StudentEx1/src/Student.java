
public class Student {
	private int studNo;
	private String name,city;
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int studNo,String name,String city ) {
		this.studNo = studNo;
		this.name = name;
		this.city = city;
	}

}
