package pk06;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {
		// Car Ŭ������ ��ü����(myCar)
		Car myCar = new Car();
		myCar.maxSpeed = 350;
		
		// �ʵ尪 ���

		System.out.println("ȸ�� :" + myCar.company + " ���� :" + myCar.color + " �� :" + myCar.model + " �ƽøؽ��ǵ� :"
				+ myCar.maxSpeed + " ���� ���ǵ� :" + myCar.speed);

		// �ʵ尪 ����
		myCar.company = "����ڵ���";
		myCar.color = "�Ͼ��";
		myCar.model = "K5";
		myCar.speed = 150;
		
		// �ʵ尪 ���� �� ���(speed,company,model)
		System.out.println("ȸ�� :" + myCar.company + " ���� :" + myCar.color + " �� :" + myCar.model + " �ƽøؽ��ǵ� :"
				+ myCar.maxSpeed + " ���� ���ǵ� :" + myCar.speed);
		
	}

}
