package pk16;

public class A_08ThreeDPrinterTest {

	public static void main(String[] args) {
		
		A_07ThreeDPrinter printPowder=new A_07ThreeDPrinter();//�����
		
		A_05Powder p1=new A_05Powder();//���
		
		printPowder.setMaterial(p1);
		A_05Powder p2=(A_05Powder)printPowder.getMaterial();
		System.out.println(p2);
		
		System.out.println();
		
		A_07ThreeDPrinter printPrinter=new A_07ThreeDPrinter();//�����
		
		A_06Plastic p3=new A_06Plastic();//���
		
		printPrinter.setMaterial(p3);
		A_06Plastic p4=(A_06Plastic)printPrinter.getMaterial();
		System.out.println(p4);
		
	}

}
