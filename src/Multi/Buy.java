package Multi;

public interface Buy {

	void buy();
	
	default void order() {//����Ʈ : �������̽��� �޼��带 �����ϸ� �ȵǼ� ����Ʈ ���
		System.out.println("���� �ֹ�");
		
	}
}
