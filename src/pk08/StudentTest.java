package pk08;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.setStudentName("이지원");
		//System.out.println(studentLee.serialNum);//경고 : 클래스명으로 참조가 원칙
		//Student.serialNum++; //Student 클래스의 생성자를 이용하여 자동  증가
		System.out.println(studentLee.studentName+"님의 학번 : "+studentLee.studentID);
		
		System.out.println("-------------------");
		
		Student studentson=new Student();
		studentson.setStudentName("손수경");
		//Student.serialNum++;
		System.out.println(studentson.studentName+"님의 학번 : "+studentson.studentID);

		

	}

}
