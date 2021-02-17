package pk19;

interface PrintString{
	
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {

		PrintString lam=s->System.out.println(s);
		lam.showString("����");//������ Ȱ��
		
		showMyString(lam);//�޼��� Ȱ��
		
		//return ���� �ִ� �޼���
		PrintString restr=returnString();
		restr.showString("�����ϴ�");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("�Ⱦ�");
	}

	public static PrintString returnString() {
		return s->System.out.println(s+" ������?");
	}
	
}
