package pk03;

import javax.swing.JOptionPane;

public class SwitchCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 : ������ȸ�� �����ϼ̽��ϴ�
		// 2 : ��������� �����ϼ̽��ϴ�
		// 3 : �����Ա��� �����ϼ̽��ϴ�
		// 4 : ������ü�� �����ϼ̽��ϴ�
		// �׹ۿ� : ��ȣ�� �߸� �����̽��ϴ�.
		int banknum=Integer.parseInt(JOptionPane.showInputDialog("1:��ȸ 2:��� 3:�Ա� 4:��ü"));
		int number;
	
	switch (banknum) {
		case 1:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�");
			break;
		case 2:
			System.out.println("��������� �����ϼ̽��ϴ�");
			break;
		case 3:
			System.out.println("�����Ա��� �����ϼ̽��ϴ�");
			break;
		case 4:
			System.out.println("������ü�� �����ϼ̽��ϴ�");
			break;
		default:
			System.out.println("��ȣ�� �߸� �����̽��ϴ�.");
			break;
	
		}
	

	}

}
