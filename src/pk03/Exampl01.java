package pk03;

import javax.swing.JOptionPane;

public class Exampl01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if��
		//�μ��� �Է� �޾Ƽ�(Num1 Num2) Num1�� ũ��"Num1(��)�� �� Ů�ϴ�"
		//Num2�� ũ��"Num2(��)�� �� Ů�ϴ�"
		//�� �� �� ���� �����ϴ�.
		
		int Num1 = (int) (Math.random() * 6) + 1;
		
		int Num2 = (int) (Math.random() * 6) + 1;
		
		if(Num1>Num2) {
			System.out.println("Num1�� �� Ů�ϴ�");
			System.out.println("Num1 ��: " +Num1);
			System.out.println("Num2 ��: " +Num2);
		}
		else if(Num1<Num2) {
			System.out.println("Num2�� �� Ů�ϴ�");
			System.out.println("Num1 ��: " +Num1);
			System.out.println("Num2 ��: " +Num2);
		}	
		else {
			System.out.println("�� �� �� ���� �����ϴ�.");
			System.out.println("Num1 ��: " +Num1);
			System.out.println("Num2 ��: " +Num2);
		/* ������ ��
		Num1=Integer.parseInt(JOptionPane.showInputDialog("��1"))
		Num1=Integer.parseInt(JOptionPane.showInputDialog("��1"))
		if(Num1>Num2) {
			System.out.println("Num1�� �� Ů�ϴ�");
			System.out.println("Num1 ��: " +Num1);
			System.out.println("Num2 ��: " +Num2);
		}
		else if(Num1<Num2) {
			System.out.println("Num2�� �� Ů�ϴ�");
			System.out.println("Num1 ��: " +Num1);
			System.out.println("Num2 ��: " +Num2);
		}	
		else {
			System.out.println("�� �� �� ���� �����ϴ�.");
			System.out.println("Num1 ��: " +Num1);
			System.out.println("Num2 ��: " +Num2)
	*/
		}
				
		
		

	}

}
