package pk08;

public class Student {
	
	public static int serialNum=2020;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	//�й��� ��ü ������ �ڵ����� �ϳ��� ����
	public Student() {
		serialNum++;
	
		studentID=serialNum;
	}
	
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
