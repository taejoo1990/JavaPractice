package pk05;

public class FunTest07 {
	//Recursive call(����� �Լ�)
	public static int Recur1(int a) {
		int gop;
		System.out.println(a);
		if (a==1)
			return (1);//breck�� ���� ����
		else gop=a*Recur1(a-1);//�ڱⰡ �ڱ� �ڽ��� ȣ��(��� �Լ�)
		
		return (gop);
		//���� �޸��� ��� �ѹ� ����ϰ� ������ �ڸ��� ���ư���.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res, x=4;
		System.out.println("����� main()���� �Դϴ�");
		res=Recur1(x);
		
		System.out.println();
		System.out.println("1 ~ 4 ���� �� : "+ res+ "\n");
		
		System.out.println("���� �޸𸮿��� �Լ��� �Ҹ�Ǵ� ���� => �������� �����");

	}

}
