package pk09;

public class Car {
	//����
	public int speed;
	
	//�Ϲ� �޼ҵ�
	public void speedUp() {
		speed +=1;
	}

	//final �޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed=0;
	}
	
	
}
