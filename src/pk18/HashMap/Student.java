package pk18.HashMap;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.name=name;
		this.sno=sno;
	}
	
	//�й��� �̸��� ������ return �׷��� ������ false
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		//���࿡//��Ʃ��Ʈ�� �������� ����ϸ�
			Student st=(Student)obj;
			//������ ��ü(�ٿ�ĳ����)�� ��Ʃ��Ʈ ��ü�� ���
			return (st.name.equals(name))&&(st.sno==sno);
			//name��sno��� ���ٸ� �ǵ���(����)
		}else {
			return false;
		}
	}
	public int hashCode() {
		return name.hashCode()+sno;
	}//������ �������� �ؽ��ڵ带 ����Ұ�� ���� ���������� ���ӿ� ��������
	
}
