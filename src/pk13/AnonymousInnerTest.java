package pk13;

//�͸��� ���� Ŭ����
class Outter{
	
	Runnable getRunnable(int i) {
		int num=100;//
		
		//Ŭ���� ����� ����
		return new Runnable() {

			@Override
			public void run() {
				//num=200;
				//i=10;
				System.out.println(i);
				System.out.println(num);
				
			}
			
			
		};
	}
	Runnable runner=new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸��� Ŭ����");
			
		}
		
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter out=new Outter();
		
		Runnable r=out.getRunnable(10);
		r.run();
		out.runner.run();

	}

}
