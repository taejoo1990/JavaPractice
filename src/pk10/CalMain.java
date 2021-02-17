package pk10;

public class CalMain {

	public static void main(String[] args) {
		
	/*	Calplus cp=new Calplus();
		System.out.println("CalPlus : "+ cp.getResult(10, 20));
		
		CalMinus cm=new CalMinus();
		System.out.println("CalMinus : "+cm.getResult(20, 10));
*/

	Calplus cp=new Calplus();
	CalMinus cm=new CalMinus();
	
	Op(new Calplus());
	Op(cm);
	}
	
	public static void Op(CalculatorExam ct) {
		ct.getResult(20, 10);
	}
	
	
	
}
