package pk14;

public class Z_04SystemTimeExample {

	public static void main(String[] args) {
		long time1=System.nanoTime(); //�ð� start
		
		int sum=0;
		for(int i=0; i<1000000;i++) {
			sum+=i;
		}
		long time2=System.nanoTime(); //�ð� end
		
		System.out.println("1~1000000������ �� : "+sum);
		System.out.println("��꿡"+(time2-time1)+"�����ʰ� �ҿ�Ǿ����ϴ�.");

	}

}
