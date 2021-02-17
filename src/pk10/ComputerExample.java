package pk10;

public class ComputerExample {

	public static void main(String[] args) {
		int r=10;
		
		Calculator ca=new Calculator();
		double res1=ca.areaCircle(r);
		System.out.println("Calculator class : "+res1);
		
		Computer c=new Computer();
		System.out.println("Computer class : "+c.areaCircle(r));
		

	}

}
