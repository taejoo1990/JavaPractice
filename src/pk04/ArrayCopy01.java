package pk04;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {10,20,30,40,50};
		int[] array2= {1,2,3,4,5};
		System.arraycopy(array1, 0, array2, 1, 4);
		              //array1에0번쨰부터array2에첫번쨰자리로4개복사
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i] + " ");
		}

	}

}
