package pk06;

public class StudentMain2 {

	public static void main(String[] args) {
		//필드를 이용하여 Name과 address 출력
		
		System.out.println("----필드를 아용----");
		Student stdA=new Student();
		stdA.StudentName="김치즈";
		stdA.address="서울시 강서구";
		stdA.showStudentInto();
		//메서드를 이용하여 Name과 address 출력
		Student stdB=new Student();
		System.out.println("---메서드를 이용---");
		stdB.StudentName="박수";
		stdB.address="경기도 고양시";
		stdB.showStudentInto();
	}

}
