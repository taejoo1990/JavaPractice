package pk03;

public class IfExample08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*6)+1;
		//�տ� int�⿡ Math.random��char�̱⿡ �տ� (int)�� �����ش�
		//Math.random �⺻ double
		//double num1=(Math.random()*6);//�Ǽ��� ���ڰ� �������� �����
		//integer.parseInt : string ->int
		System.out.println("num : " + num);
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}else {
			System.out.println("6���� ���Խ��ϴ�.");
		}

	}

}
