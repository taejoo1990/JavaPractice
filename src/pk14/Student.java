package pk14;

public class Student {

	int studentId;
	String studentName;
	
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	//toString
	@Override
	public String toString() {
		return studentId+", "+studentName;
		
	}
//논리적 판단
	@Override
	public boolean equals(Object obj) {
		// Object의 객체인 obj가 Student에 맞는 타입인지 확인
		//연산자로써 객체 타입 형변환이 가능한지 확인
		if(obj instanceof Student) {
			//부모클래스가 자식클래스로 다운 캐스팅
			Student std=(Student)obj;
			if(studentId==std.studentId)
				return true;
			else return false;
		}
		return super.equals(obj);
		
	}
//물리적 판단
	@Override
	public int hashCode() {
		//return super.hashCode();
		return studentId;
	
	}
	
	
}
