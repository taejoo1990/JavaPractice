package pk13;

public class A {
	
	A(){
		System.out.println("A ��ü�� ����");
	}
	/**�ν��Ͻ� ��� Ŭ����**/
	public class B{
		B(){
			System.out.println("B ��ü�� ����");
		}
		//����(�ν��Ͻ� ���� ��)
		int field1;
		//static int field2;//��� ��븸����//����Ŭ�������� ������ �Ǵ� �������� ������ �ȵ�
		
		//�޼���
		void method() {}
		//static void method2() {}
		
	}
	/**���� ��� Ŭ����**/
	static class C{
		C(){
			System.out.println("C ��ü�� ����");
		}
		int field1;
		static int field2;
		//�޼���
		void method1() {};
		static void method2() {};
	}
	
	void method() {
		/**����Ŭ����**/
		class D{
			D(){
				System.out.println("D ��ü�� ����");
			}
			int field1;
			//static int field2;//����Ŭ�������� �����̵Ǵ� �������������� �ȵ�
			
			//�޼���
			void method1() {};
			//static void method2() {};
		}
		D d=new D();
		d.field1=3;
		d.method1();
		
	}
}