package pk06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		int select;
		String check;
		Start st=new Start();
		
		
		while (true) {
			System.out.print("���ڸ� ���� ������ : ");
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			check=st.check(select);
			
			if(check.equals("SUCCESS!!!"))
				break;
		}
		
	}

}
