package pk03;

public class IfExample06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		int charge=0;
		int i=10;
		
		if(age<8) {
			charge=1000;
		}
		if(age<14) {
			charge=2000;
		}
		if(age<20 &&(i+=2)<0) {
			charge=2500;
		}//����age�� true�̰� i�� false�̱⿡ ����� false�̹Ƿ� ���� �ʴ´�
		System.out.println("������ " +charge+ "���Դϴ�");
		System.out.println(i);

	}

}
