package pk08;

public class Guide {
	
	static String point;
	Guest[] guest;//�迭�� ��ü ����
	
	//�����ڸ� �̿��Ͽ� �ʱ�ȭ
	public Guide(int n) {
		point="���ֵ�";
		guest=new Guest[n];//�ʿ��� ����ŭ �迭 ����
		
		for(int i=0;i<guest.length;i++) {
			guest[i]=new Guest();//�迭 �ʱ�ȭ
		}

	}
	

}
