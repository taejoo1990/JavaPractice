package pk14;

public class ExtendsEx1Main {

	public static void main(String[] args) {
		ExtendsEx1 v1=new ExtendsEx1();
		v1.setValue("TEST");
		//���ڰ� Object������ String�� Object�� ��� �޾����Ƿ� ��밡��
		
		System.out.println("String : "+ v1.getValue());

		//����(int)�� ���ڷ� �־
		ExtendsEx1 v2=new ExtendsEx1();
		v2.setValue(100);//(�ڵ� ����ȯ : �⺻�ڷ���(int) ->��ü(Object))AutoBoxing
		//v2�� ����ȯ �߱⿡ Ŭ�������� ��ü�� ������
		
		//���� ����ȯ�� ���ļ� �⺻ �ڷ������� ����(�ڹ� 8���� �̸�)
		//int i=(Integer)v2.getValue();
		
		//������ ĳ�����ص� ����� �� �ֵ��� �ٲ�
		//UnBoxing ��ü -> �⺻ �ڷ���
		int i=(int)v2.getValue();//��ڽ̰� �ٿ�ĳ������ ����� ���ھȳ�
		System.out.println("UnBoxing : "+i+1);
	}

}
