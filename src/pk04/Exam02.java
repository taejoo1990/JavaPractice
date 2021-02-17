package pk04;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array= {{95,86},{93,92,96},{78,93,83,97,88}};
		
		int sum=0;
		double avg=0.0;
		int count=0;
		
		int total=0;
		double tAvg=0;
		int cnt=0;
		
		
		for(int i=0;i<array.length;i++) {//행
			for(int j=0;j<array[i].length;j++) {
				sum +=array[i][j];
				count++;
			}
			avg= (double)sum/count;
			
			System.out.println("sum : "+sum);
			System.out.println(String.format("avg : %.2f", +avg));
			
			total+=sum;
			cnt+=count;
			//다음 작업을위한 초기화
			sum=0;
			avg=0.0;
			count=0;
			System.out.println("--------------------");
		}
		tAvg= (double)total/cnt;
		
		System.out.println("=========최종========");
		System.out.println("sum : "+total);
		System.out.println(String.format("tAvg : %.2f",tAvg));
		

	}

}
