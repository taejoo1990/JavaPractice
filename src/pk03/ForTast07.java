package pk03;

public class ForTast07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int num=0;
		
		for(num=0;/*num<100*/;num++) {//�Ʒ���if(sum>100)�ֱ⿡
			sum+=num+1; //sum=sum+num //num<100�� �ʿ䰡����
			if(sum>100)
				break;
		}
		
		System.out.println("num : "+ num);
		System.out.println("sum : "+ sum);

	}

}
