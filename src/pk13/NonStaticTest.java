package pk13;

import javax.swing.JOptionPane;

class Out2{
	static int a=1;
	
	public class In{
		
		String Infun() {
			return(a+"��° Non-Static ����Ŭ�����Դϴ�.");
			
		}
	}

}

public class NonStaticTest {

	public static void main(String[] args) {
		String str="";
		
		//�ٱ� Ŭ���� ��ü
		Out2 obj1=new Out2();//Ŭ���� �̸����� ���� ȣ��
		//���� Ŭ���� ��ü
		Out2.In obj2=obj1.new In();
		//����(����)Ŭ������ �޼��忡 ����
		str=obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n success!");
	}

}
