package Multi;

public interface Sell {
	
	void sell();
	
	default void order() {//����Ʈ : �������̽��� �޼��带 �����ϸ� �ȵǼ� ����Ʈ ���
		System.out.println("���� �ֹ�");
	}

}