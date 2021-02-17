package pk14;

public class Z_03ExitExample {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i);//시스템 자체 종료?
				//break;
			}
		}
		System.out.println("종료되었습니다.");
	}

}
