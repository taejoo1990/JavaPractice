package pk01;

public class ImplicitConversion {

	public static void main(String[] args) {
		// ������ ����ȯ
		byte bNum=10;
		int iNum=bNum+1;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum=fNum+iNum;
		System.out.println(dNum);
		
		
	}

}
