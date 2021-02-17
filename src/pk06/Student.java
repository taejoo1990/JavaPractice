package pk06;

public class Student {
	//필드
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	//생성자(기본생성자) : free complie
	
	public void showStudentInto() {
		System.out.println(StudentName+","+address);
		//이름과 주소를 출력하는 메소드
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
