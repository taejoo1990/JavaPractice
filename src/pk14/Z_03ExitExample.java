package pk14;

public class Z_03ExitExample {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i);//�ý��� ��ü ����?
				//break;
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}

}
