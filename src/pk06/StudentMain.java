package pk06;

public class StudentMain {

	public static void main(String[] args) {
		//�ʵ带 �̿��Ͽ� ����
		Student stdA=new Student();
		stdA.StudentName="�Ƚ���";
		
		//System.out.println(stdA.StudentName);
		System.out.println(stdA.getStudentName());
		System.out.println(stdA);//hip memory
		System.out.println("-------------------");
		//�޼ҵ带 �̿��Ͽ� ��Ʈ
		Student stdB=new Student();
		stdB.setStudentName("�ѽ���");
		
		System.out.println(stdB.getStudentName());
		System.out.println(stdB);//hip memory
	}

}
