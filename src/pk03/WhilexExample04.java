package pk03;

import javax.swing.JOptionPane;

public class WhilexExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���ڰ� 6�̵Ǹ� ���߰�

		while (true) {
			int num =2;
					
			System.out.println(num);
			if (num == 6) {
				break;
			}
			
		}
		System.out.println("�����");

		// do while �Ǵ� while(�μ��� �ٸ��� ����)
		// swing�� �̿��Ͽ� �μ��� �Է¹޾Ƽ� �μ��� ������ "Same!" �� ����� ���߰� �ٸ��� "Different!"��� �� ����
		int Num1, Num2;
		do {
			Num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
			Num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
			if(Num1 ==Num2) {
				System.out.println("Same!");
				break;
			}
			System.out.println("Different!");
			
		}while (Num1 != Num2);
	}

}
