package pk04;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		//소수를 표현하는 변수(더블)로 변수이름 sum은 0으로 초기화한다.
		double[] date=new double[5];
		//소수를 표현하는 변수(더블)은 숫자 1개가 아니라
		//[]안에 들어간 만큼 쓸거야
		//변수이름은 date = 이 변수안에는 5개의 숫자가 들어갈거야.
		//date[0,1,2,3,4]
		
		//int[] date=new int[5];
		
		
		
		date[0]=10.0;
		date[1]=20.0;
		date[2]=30.0;

		for(int i=0;i<date.length;i++) {
			sum=sum+date[i]; //sum+=date[i];
			System.out.println(date[i]);
		}
		System.out.println("------");
		System.out.println(sum);
	}

}
