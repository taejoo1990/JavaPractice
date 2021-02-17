package pk03;

import java.util.Scanner;

public class Exampl03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=0;
		int result=0;
		System.out.print("첫번째 숫자입력 : "); // 
		Scanner scan =new Scanner(System.in);
		n1=scan.nextInt();
		
		System.out.print("두번째 숫자입력 : "); 
		n2=scan.nextInt();
		
		//혹시 스왑이 필요하면(n1>n2)
		if (n1<n2) {
			int n3=n1;
				n1=n2;
				n2=n3;
		}
		
		for (int i=n1;i<=n2;i++) {
			result +=i;
		}
		System.out.println(n1 + "부터" + n2 + "까지의  합"+ result);

	}

}
