package pk04;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=1;
		double[] date=new double[5];
		int size=0;
		
		date[0]=10.0;
		size++;
		date[1]=20.0;
		size++;
		date[2]=30.0;
		size++;

		for(int i=0;i<size;i++) {
			sum*=date[i];
			System.out.println(date[i]);
		}
		System.out.println("------");
		System.out.println(sum);

	}

}
