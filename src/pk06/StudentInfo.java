package pk06;

public class StudentInfo {
	
	//�ʵ�
	private int studentID;
	private String studentName;
	int grade;
	String address;
	//������
	

	//�޼ҵ�
	//private ���� ��� ���콺 ��Ŭ���Ͽ� sourc=>getset���� private�׸���
	public int getStudentID() {//üũ���� ��ȸ������ �����ϴ�
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
