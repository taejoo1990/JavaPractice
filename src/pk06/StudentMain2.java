package pk06;

public class StudentMain2 {

	public static void main(String[] args) {
		//�ʵ带 �̿��Ͽ� Name�� address ���
		
		System.out.println("----�ʵ带 �ƿ�----");
		Student stdA=new Student();
		stdA.StudentName="��ġ��";
		stdA.address="����� ������";
		stdA.showStudentInto();
		//�޼��带 �̿��Ͽ� Name�� address ���
		Student stdB=new Student();
		System.out.println("---�޼��带 �̿�---");
		stdB.StudentName="�ڼ�";
		stdB.address="��⵵ ����";
		stdB.showStudentInto();
	}

}
