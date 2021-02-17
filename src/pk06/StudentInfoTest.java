package pk06;

public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo studentLee=new StudentInfo();
		
		//studentLee.getStudentName="홍길동"; //private 이므로 직접 접근이 안됨
		studentLee.setStudentName("장길산");//public method로 우회하여 접근
		studentLee.setStudentID(1004);//sourc
		studentLee.address="서울시 종로구";
		studentLee.grade=4;
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.getStudentID());
		System.out.println(studentLee.address);
		System.out.println(studentLee.grade);

	}

}
