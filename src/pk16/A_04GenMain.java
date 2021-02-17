package pk16;

public class A_04GenMain {

	public static void main(String[] args) {
		
		A_03Gen gen=new A_03Gen();
		
		//정수형
		Integer[] iArr= {1,2,3,4,5};
		
		//더블형
		Double[] dArr= {1.1,2.2,3.3,4.4,5.5};
		
		//Character
		Character[] cArr= {'A','B','C','D','E'};
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);

	}

}
