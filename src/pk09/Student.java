package pk09;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);//부모 클래스의 생성자
		this.studentNo=studentNo;
	}

}
