package pk01;

public class Casting {

	public static void main(String[] args) {
		//���θ�� (ū�ڷ��� -> �ڷ���)
		double d=100.5; // 8byte
		int n=200; // 4byte
		d=n;
		
		System.out.println("d : "+ d);
		
		//����(�����ڷ���-> ū�ڷ���)
		char c='B'; //2byte ASCII : 66
		int m=c+1;  //4dyte ASCII : 67
		c=(char)m;  //���θ��
		System.out.println("c : "+c);
		

	}

}
