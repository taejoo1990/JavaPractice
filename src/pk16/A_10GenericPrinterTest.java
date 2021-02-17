package pk16;

public class A_10GenericPrinterTest {

	public static void main(String[] args) {

		//T type=Object
		A_09GenericPrinter<A_05Powder> printPowder=new A_09GenericPrinter<A_05Powder>();//재료통
		printPowder.setMaterial(new A_05Powder());
		A_05Powder po=printPowder.getMaterial();
		System.out.println(po);
		
		System.out.println();
		
		A_09GenericPrinter<A_06Plastic> printPrinter=new A_09GenericPrinter<A_06Plastic>();//재료통
		printPrinter.setMaterial(new A_06Plastic());
		A_06Plastic pl=printPrinter.getMaterial();
		System.out.println(pl);
		
		System.out.println();
		
		A_09GenericPrinter<A_11Water> printWater=new A_09GenericPrinter<A_11Water>();//재료통
		printWater.setMaterial(new A_11Water());
		A_06Plastic w=printPrinter.getMaterial();
		System.out.println(w);

	}

}
