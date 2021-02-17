package pk13;

//익명의 내부 클래스
class Outter{
	
	Runnable getRunnable(int i) {
		int num=100;//
		
		//클래스 선언부 생략
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
			System.out.println("Runnable이 구현된 익명의 클래스");
			
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
