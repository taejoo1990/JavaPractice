package pk03;

import java.util.Scanner;

public class Exampl03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=0;
		int result=0;
		System.out.print("ù��° �����Է� : "); // 
		Scanner scan =new Scanner(System.in);
		n1=scan.nextInt();
		
		System.out.print("�ι�° �����Է� : "); 
		n2=scan.nextInt();
		
		//Ȥ�� ������ �ʿ��ϸ�(n1>n2)
		if (n1<n2) {
			int n3=n1;
				n1=n2;
				n2=n3;
		}
		
		for (int i=n1;i<=n2;i++) {
			result +=i;
		}
		System.out.println(n1 + "����" + n2 + "������  ��"+ result);

	}

}
