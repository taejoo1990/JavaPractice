package pk07;

import javax.swing.JOptionPane;

public class Encapsulation1Main {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		String str="";
		
		Encapsulation1 e1=new Encapsulation1();
		
		side=Integer.parseInt(JOptionPane.showInputDialog("�غ�"));
		height=Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		Area=e1.cal_Area(side, height);
		
		//�뷮�� ���̱� ���ؼ���  Area�� ��������ʰ� 
		//System.out.println("�簢���� ���̴� : "+e1.cal_Area(side, height));
		//�̷������� ���
		
		System.out.println("�簢���� ���̴� : "+Area);
		str="�簢���� ���̴� "+Area+"�Դϴ�.";
		JOptionPane.showMessageDialog(null, str);
	}

}
