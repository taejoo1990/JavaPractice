package pk02;

public class IncreTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a :" + (++a)); // a=a+1 or a+=1
		//++���� ������������ 1����
		System.out.println("a++ :" + (a++));
		//�ڿ�++�� ������ ����� ���
		System.out.println("������� : " + a);//12
		System.out.println("c++ : " + (c++));
		System.out.println("������� : " + c);
		System.out.println("++a + b++ : " + (++a + b++));//33
                                           //+13  +20
		System.out.println("������� : " + b);
		//fir(int i=0; i<5;i++);
		//fir(int i=0; i<5;++i);
		
		
		
	}

}
