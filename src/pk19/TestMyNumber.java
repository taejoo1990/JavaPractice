package pk19;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber max=(x,y)->(x>=y)? x:y;

		System.out.println(max.getMax(10, 20));
		System.out.println("===================");
		
		
		//�͸��� ���� Ŭ����
		MyNumber aa=new MyNumber() {

			@Override
			public int getMax(int number1, int number2) {
				return 0;
			}
			
		};
	
	}

}
