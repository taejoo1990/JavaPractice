package pk11;

public class DeskTop extends Computer{
	//�߻� Ŭ������ ��� �������� �߻�޼ҵ带 ��� �籸�� ���־�� ��� ���� �� �־�
	//�ϳ��� �籸������ ���� �߻�޼ҵ尡 ���� ������ �⺻ class�� �������� �ʴ´� �׷��Ƿ�
	//Ŭ�������� adstract class�� �����
	
	@Override
	public void display() {
		System.out.println("DeskTop Display.");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop  typing.");
	}

	
}
