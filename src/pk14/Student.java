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
//���� �Ǵ�
	@Override
	public boolean equals(Object obj) {
		// Object�� ��ü�� obj�� Student�� �´� Ÿ������ Ȯ��
		//�����ڷν� ��ü Ÿ�� ����ȯ�� �������� Ȯ��
		if(obj instanceof Student) {
			//�θ�Ŭ������ �ڽ�Ŭ������ �ٿ� ĳ����
			Student std=(Student)obj;
			if(studentId==std.studentId)
				return true;
			else return false;
		}
		return super.equals(obj);
		
	}
//������ �Ǵ�
	@Override
	public int hashCode() {
		//return super.hashCode();
		return studentId;
	
	}
	
	
}
