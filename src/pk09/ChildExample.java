package pk09;

public class ChildExample {
	
	public static void main(String[] args) {
		
		Child child=new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		Parent parent=child;
		parent.method1();
		parent.method2();
		
		//parent.method3(); //호출 불가능(child에서 만들었기에 호출불가)
	}

}
