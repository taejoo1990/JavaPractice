package pk13;

//�ܺ� Ŭ����
class OutClass {
	// �ܺ� Ŭ������ �ʵ�
	private int num = 0;
	private static int sNum = 20;
	InClass inClass;

	// ������(Construct)�� ���ؼ� ����Ŭ���� ��ü�� ����
	public OutClass() {
		//inClass = new InClass();// ����Ŭ���� ����
		//usingClass���� ���� ���������� usingClassó���̿�
	}

	// ���� Ŭ����(Non-static)
	// �ν��Ͻ� ���� Ŭ���� : �ܺ�Ŭ�������� ���� ��������� ����
	// �ν��Ͻ� ���� Ŭ�������� ����� �� �ִ� ���� : �ܺ� �ν��Ͻ� ���� (�������=�ʵ�=�Ӽ�),
	// �ܺ��ν��Ͻ� ������ ��������(static)(��븸)
	// ��ü ������� : �ܺ�Ŭ������ ���� ���� �� ���� Ŭ���� ����
	class InClass {
		int inNum = 100;// ���� Ŭ������ �ʵ�
		// static�� ������ �ǰ� ������� ����Ϸ��� �����̹Ƿ� �ٸ������� ������ �� �� ����
		// static sNum=210;//���� ��
		int num = 0;

		void inTest() {

			System.out.println("OutClass num = " + num + "(�ܺ�Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ�Ŭ������ ���� ����)");
		}

	}

	// �ܺ� Ŭ������ �޼���
	public void usingClass() {
		inClass.inTest();
	}

	// ���� ���� Ŭ����(static)
	// ���� ���� Ŭ���� : �ܺ�Ŭ�������� ���� ��������� ����
	// ���� ���� Ŭ�������� ����� �� �ִ� ���� : �ܺ��ν��Ͻ� ������ ��������(static)
	// ��ü ������� : �ܺ�Ŭ�����ʹ� �����ϰ� ���� Ŭ���� ����
	static class InStaticClass {
		// �������
		int inNum = 100;
		static int sInNum = 200;

		// num=200;//��ü�� �־�� ��밡���ϹǷ� �Ұ�
		void inTest() {
			// �ܺ�Ŭ������ �ν��Ͻ� ������ ����� �� ���� ����:
			// ����ƽ ó������ �����Ϳ����� �����ְ� �ܺ� �ν��Ͻ��� �ݵ�� ��ü������
			// �ؾߵǴϱ� ������ �Ұ���
			// ���� ���� �ȿ��� �𸣴� �� �˷��޶�� �ٸ���� �������´�
			// static Ŭ������ ���α׷� ���۰� ���ÿ� �̹� �޸𸮿� �ö�
			// �ٵ� num�� ������ƽ ������ �ȵ��ִ³��̴ϱ� ������ ��Ű�鼭 �߰��� �ö󰡴³��̴ϱ�
			// �̹� �޸𸮿� �ö��ִ¾ְ� ������ ������ �ϴµ� ��? �� ��𰬾� �̻�Ȳ�� �Ǵ°���
			// num+=10;
			inNum = 100;
			sInNum = 200;
			sNum = 300;// �ܺ� Ŭ������ ����ƽ
			System.out.println("InStaticClass inNum =" + inNum + "(���� �ν��Ͻ� ����)");
			System.out.println("InStaticClass sinNum =" + sInNum + "(���� static)");
			System.out.println("InStaticClass sNum =" + sNum + "(�ܺ� static)");
			// System.out.println("InStaticClass sNum ="+Num+"(�ܺ� �ν��Ͻ� ����)");
		}

		static void sTest() {
			// num+=10;
			// inNum+=10;
			sInNum = 200;
			sNum = 300;// �ܺ� Ŭ������ ����ƽ
			System.out.println("InStaticClass sNum =" + sNum + "(�ܺ�Ŭ������ �ν��Ͻ� ����)");
			System.out.println("InStaticClass sinNum =" + sNum + "(�ܺ�Ŭ������ ���� ����)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		//private���� ���� ���ٽ� ȣ��
		System.out.println("private���� ���� ���ٽ� ȣ��");
		OutClass outClass = new OutClass();
		outClass.usingClass();
		System.out.println();
		
		
		
		// �ܺ� Ŭ������ ���� ����� �� ��ü�� �̿��ؼ� ���� Ŭ���� ��ü ����
		//OutClass outClass = new OutClass();
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("�Ϲ� ���� Ŭ������ �Ϲ� �޼��� ȣ��");
		inClass.inTest();
		System.out.println();

		// �ܺ�Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ������ �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println("���� ���� Ŭ������ Static �޼��� ȣ��");
		sInClass.sTest();
		OutClass.InStaticClass.sTest();
		;
	}

}
