package pk06;

public class Student {
	//�ʵ�
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	//������(�⺻������) : free complie
	
	public void showStudentInto() {
		System.out.println(StudentName+","+address);
		//�̸��� �ּҸ� ����ϴ� �޼ҵ�
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
