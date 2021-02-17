package pk08;

import java.security.Guard;
import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		System.out.print("������ �� : ");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		
		Guide guide=new Guide(n);
		
		System.out.println("������ ���");
		for(int i=0;i<n;i++) {
			
			System.out.print((i+1) + ". �̸� : ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1) + ". ���� : ");
			String g=scan.next();
			guide.guest[i].setGender(g);
		}
		
		outer : while(true) {
			
			System.out.println("1. ������ ���� ");//�̸�, ����, ������
			System.out.println("2. ������ ���� ");//������ ����
			System.out.println("3. ���� ");
			System.out.println("����>>");
			
			
			int select=scan.nextInt();
			
			switch (select) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println((i+1)+".�̸� : "+guide.guest[i].getName());
					System.out.println((i+1)+".���� : "+guide.guest[i].getGender());
					System.out.println((i+1)+".������ : "+guide.guest[i].getPoint());
					System.out.println();
				}
				System.out.println("-------------------");
				break;
				
			case 2:
				System.out.print("�����Ͻ� ���� �������� �Է��ϼ��� : ");
				Guide.point=scan.next();//����ƽ���� Ȱ��
				System.out.println(Guide.point +"(��)�� ����Ǿ����ϴ�");
				System.out.println("-------------------");
				break;
				
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				break outer;
			}
		}
		
	}

}
