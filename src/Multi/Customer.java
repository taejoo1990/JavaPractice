package Multi;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
		
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
		
	}
	//����Ʈ �޼��� ����
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
		//Buy.super.order();
	}

}
