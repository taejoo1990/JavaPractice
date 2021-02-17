package pk03;

public class IfExample05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMarried=true;
		
		if(isMarried) {
			System.out.println("±âÈ¥ÀÔ´Ï´Ù");
		}
		
		boolean isEven;
		int num=10;
		isEven=(num%2==0)? true:false;
		
		int sum=0;
		int num2;
		for(num2=1, sum=0; ; num2++) {
			sum +=num2;
			if(sum>500)
				break;
		}
		System.out.println(sum);
		System.out.println(num2);
		

	}

}
