package pk05;

public class Ex1_OverloadingMain {

	public static void main(String[] args) {
		//�����Ҽ� �ִ� �ν��Ͻ� ���� �� ��ü�� ����� ���� ����ؾ� �Ѵ�.
		//int a=0;
		Ex1_Overloading  a=new Ex1_Overloading();
		//Ex1_Overloading�� �޸𸮸� �Ҵ��� ��� �ϱ⿡ new�� ���´�
		//�⺻ �����ڸ� ���� ��ü ����
		a.getResult(65);//int
		a.getResult('a');//char
		a.getResult("����");//String
		a.getResult(10, "����");//int, String
	}


}
