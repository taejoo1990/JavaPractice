package pk03;

import javax.swing.JOptionPane;

public class SwitchCase05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month=Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���"));
		int day;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 2:
			day=28;
		case 4: case 6: case 9: case 11:
			day=30;
			break;

		default:
			day=0;
			System.out.println("�������� �ʴ� ���Դϴ�");
		
		}
		
		System.out.println(month + "����" + day + "�� ���� �ֽ��ϴ�");

	}

}
