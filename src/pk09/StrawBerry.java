package pk09;

public class StrawBerry extends Berry{
	//������ ������ ��ӹ����ž�(������ ���� ���)(����� �������)
	private String color;
	private int price;
	
	public void set3(String a, int b) {
		color=a;
		price=b;
		
	}
	
	public void Disp3() {
		System.out.println("���� : "+color);
		System.out.println("���� : "+price);
	}

}
