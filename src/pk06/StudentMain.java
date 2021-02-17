package pk06;

public class StudentMain {

	public static void main(String[] args) {
		//필드를 이용하여 세팅
		Student stdA=new Student();
		stdA.StudentName="안승현";
		
		//System.out.println(stdA.StudentName);
		System.out.println(stdA.getStudentName());
		System.out.println(stdA);//hip memory
		System.out.println("-------------------");
		//메소드를 이용하여 셋트
		Student stdB=new Student();
		stdB.setStudentName("한승현");
		
		System.out.println(stdB.getStudentName());
		System.out.println(stdB);//hip memory
	}

}
