package pk06;

import java.util.Random;

public class Start {
	
	private int random=new Random().nextInt(50)+1;//PC�� �����ִ� ��
	private int count=0;
	private String result="FAIl";
	
	public String check(int n) {
		
		count++;
		
		if(n<random) {
			System.out.println("UP!");	
		}else if(n>random) {
			System.out.println("DOWN!");
		}else {
			System.out.println("����!\n"+count+"�� ���� �������ϴ�");
			System.out.println();
			result="SUCCES";
		}
		return result;
	
	}
	
}
