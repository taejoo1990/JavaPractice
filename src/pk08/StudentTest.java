package pk08;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.setStudentName("������");
		//System.out.println(studentLee.serialNum);//��� : Ŭ���������� ������ ��Ģ
		//Student.serialNum++; //Student Ŭ������ �����ڸ� �̿��Ͽ� �ڵ�  ����
		System.out.println(studentLee.studentName+"���� �й� : "+studentLee.studentID);
		
		System.out.println("-------------------");
		
		Student studentson=new Student();
		studentson.setStudentName("�ռ���");
		//Student.serialNum++;
		System.out.println(studentson.studentName+"���� �й� : "+studentson.studentID);

		

	}

}
