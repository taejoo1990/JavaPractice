package pk06;

import javax.swing.JOptionPane;

public class SungJuk {
	//�ʵ�
	private String Std_num;
	private String Std_name;
	private int Java, Python, R;
	//private���� ���� ���� Ŭ���� �������� ��� ���������� �ٸ� Ŭ�������� �����Ҽ� ����
	//StudentInfoTest����
	//������(�⺻ ������)
	//public SungJuk() {};
	
	//�޼ҵ�
	public void Sum() {
		System.out.println("�� �� : " + (Java+Python+R)+" �� �Դϴ�");

	}
	
	public void Avg() {
		System.out.println("�� �� : " + (Java+Python+R)/3+" �� �Դϴ�");
		
	}
	
	public static void main(String[] args) {
		SungJuk rec=new SungJuk(); //��ü ����
		//������� ����
		rec.Std_num=JOptionPane.showInputDialog("�й�");
		//Ŭ���� jungjuk�� ������ �� �ִ� rec�� ���ؼ�
		//Ŭ���� sungjuk�� �ִ� ����(int) std_num�� ������,
		//stunum�� jop�� ���ؼ� "�й�"�̶�� �޼����� �����־
		//����ڿ��� ���ڸ� �����ž�.
		rec.Std_name=JOptionPane.showInputDialog("����");
		rec.Java=Integer.parseInt(JOptionPane.showInputDialog("Java"));
		rec.Python=Integer.parseInt(JOptionPane.showInputDialog("Python"));
		rec.R=Integer.parseInt(JOptionPane.showInputDialog("R"));
		
		System.out.println(rec.Std_num+" , "+rec.Std_name+"�� �����Դϴ�.");
		//�޼ҵ带 ����
		rec.Sum();
		rec.Avg();
		
	
	}

}
