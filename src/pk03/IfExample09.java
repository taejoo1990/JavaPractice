package pk03;

import java.util.Scanner;

public class IfExample09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է�
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("����: ");
		double Jscore=Double.parseDouble(scanner.nextLine());
		
		System.out.println("�ο���: ");
		double Pscore=Double.parseDouble(scanner.nextLine());
		
		System.out.println("----------------");
		if(Pscore != 0.0) {
			System.out.println("��� : "+(Jscore/Pscore));
		}else {
			System.out.println("��� : �л��� ��ϵǾ� ���� �ʽ��ϴ�");
		}
		

	}

}
