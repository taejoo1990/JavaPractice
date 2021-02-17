package pk06;

public class StudentInfo {
	
	//필드
	private int studentID;
	private String studentName;
	int grade;
	String address;
	//생성자
	

	//메소드
	//private 같은 경우 마우스 우클릭하여 sourc=>getset으로 private항목을
	public int getStudentID() {//체크한후 우회접근이 가능하다
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
