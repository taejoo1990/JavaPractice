package pk09;

public class Child extends Parent{
	//Override / Overloading ==>�������� ���� ����Ѵٴ� �������� �ִ�
	public void method2() {
		System.out.println("Child-method2()");//�������̵�
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
//�������̵��� ����� �޾ƾ߸� ����Ҽ��ִ�
//�����ε�(Overloading) : ���� �̸��� ����Ҽ� ����
                             //(�Ű������� �ٸ����ؼ� ���̸� ��)
//�������̵�(Override) : ���� �̸��� ����Ҽ������� ������ �ٲ�����Ѵ�
                            //(�Ű������������ �������̸� ��)
//����Ʈ �ÿ��� ���Ƶ� ��������� �ٸ���쿡�� ������ �޶�� �ȴ�
                   //(������ �ٸ��� �Ϸ��� ���⿡ �Ű� �Ƚᵵ �ɵ�)
//��� Ŭ������ ����Ŭ������ ������ �θ��� ����