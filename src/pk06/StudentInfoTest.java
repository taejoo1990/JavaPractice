package pk06;

public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo studentLee=new StudentInfo();
		
		//studentLee.getStudentName="ȫ�浿"; //private �̹Ƿ� ���� ������ �ȵ�
		studentLee.setStudentName("����");//public method�� ��ȸ�Ͽ� ����
		studentLee.setStudentID(1004);//sourc
		studentLee.address="����� ���α�";
		studentLee.grade=4;
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.getStudentID());
		System.out.println(studentLee.address);
		System.out.println(studentLee.grade);

	}

}
