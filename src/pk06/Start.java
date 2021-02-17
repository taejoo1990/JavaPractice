package pk06;

import java.util.Random;

public class Start {
	
	private int random=new Random().nextInt(50)+1;//PC가 갖고있는 수
	private int count=0;
	private String result="FAIl";
	
	public String check(int n) {
		
		count++;
		
		if(n<random) {
			System.out.println("UP!");	
		}else if(n>random) {
			System.out.println("DOWN!");
		}else {
			System.out.println("정답!\n"+count+"번 만에 맞혔습니다");
			System.out.println();
			result="SUCCES";
		}
		return result;
	
	}
	
}
