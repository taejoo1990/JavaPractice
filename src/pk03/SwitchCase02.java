package pk03;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal=JOptionPane.showInputDialog("�޴� ������ �Է��ϼ���");
		
		switch (medal) {
			case "G":
				System.out.println("�ݸ޴�");
				break;
				
			case "S":
				System.out.println("���޴�");
				break;
				
			case "B":
				System.out.println("���޴�");
				break;

			default:
				System.out.println("�޴��� �����ϴ�");
		}
		
		
		
	}

}
