package pk05;

public class FunTest04 {

	//call by velue : "���� ���� ȣ��"
	
	public static void swap(int x, int y) {
		
		int temp =x;
		x=y;
		y=temp;
	}
	
	public static void main(String[] args) {

		int a=10;//�������� (���ú���) :�� ���� �ȿ��� Ȱ���ϴ� ����
		int b=20;
		
		System.out.println("swap() ȣ���� : a="+a+" , b="+b);
		swap(a,b);//��ȯ ����(���� �Ѱ� �ְ� �����)
		//�������� ���� �ٱ� �޸𸮸� ȣ����
		System.out.println("swap() ȣ���� : a="+a+" , b="+b);
		//�ڽ��� �ּҸ� ����

	}

}
