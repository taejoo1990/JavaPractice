package pk13;

public class Outter2 {
	String field="Outer-field";
	public Object runner;
	void method() {
		System.out.println("Outer-method");
	}
	
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}//this = ���� �����ִ� Ŭ������ �ʵ念���� �ִ°�
		void  print() {
			System.out.println(this.field);
			this.method();
			System.out.println(this.field);
			Outter2.this.method();
		}
	}

	public Runnable getRunnable(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Nested Nested() {
		// TODO Auto-generated method stub
		return null;
	}

}
