package pk09;

public class InheritanceTest {

	public static void main(String[] args) {

		StrawBerry obj=new StrawBerry();
		
		obj.set1("Berry류", "여름");//Fruit에서 받은거야
		obj.set2("딸기", "대");//Berry에서 받은거야
		obj.set3("빨강", 5000);//StrawBerry에서 받은거야
		
		obj.Disp1();
		obj.Disp2();
		obj.Disp3();

	}

}
