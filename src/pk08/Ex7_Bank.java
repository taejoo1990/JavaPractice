package pk08;

public class Ex7_Bank {

	private String point;//���� ��ġ
	private String tal;//���� ��ȭ��ȣ
	
	static float interest;//���� ����
	
	public Ex7_Bank(String point, String tal) {
		this.point=point;
		this.tal=tal;
		
	}
	
	//��� ���
	
	public void getBank() {
		System.out.println("���� : "+ point+"\n"+"��ȭ��ȣ : "+tal+"\n"+"������ : "+interest);
	}
	
	
}
