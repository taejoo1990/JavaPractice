package pk13;

//��������
public class S {
	//��ü�� �־�� ���
	int field1;//1  hip����
	void method1() {}//2   hip����
	//��ü�� ��� ��밡��
	static int field2;//3  ������ ����
	static void method2() {}//4   ������ ����
	
	class B{//���� �����´�   hip����
		void method() {
			field1=10;//1
			method1();//2
			
			field2=20;//3
			method2();//4
		}
	}
	
	static class C{//����ƽ�� ���   ������ ����
		void method() {
			//int field1;//1
			//void method1() {}//2
			field2=30;//3
			method2();//4
		}
	}

}
