package pk03;

public class ForTast08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=0;
		int num=0;
		
		for(num=0;num<100 ;num++) {
			if(num % 2 == 0)//Â¦¼ö
				continue; //pass
			total+=num+1; //total=total+num

		}
		
		System.out.println("num : "+ num);
		System.out.println("total : "+ total);
		
	}

}
