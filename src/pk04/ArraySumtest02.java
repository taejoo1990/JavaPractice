package pk04;

public class ArraySumtest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		//scores =new int[] {83,90,97};
	/*	
		int sum1=0;
		for(int i=0;i<scores.length;i++) {
			sum1+=scores[i];
		}
		System.out.println("ÃÑ Á¡ : "+sum1);
	*/
		int sum2=add(new int[] {83,90,87});
		System.out.println("ÃÑ Á¡ : "+sum2);
		System.out.println();
		
		int sum3=add(new int[] {90,85,70});
		System.out.println("ÃÑ Á¡ : "+sum3);
		System.out.println();
		
		
	}//main close
	
		//method
		public static int add(int[] scores) {
			int sum=0;
			for(int i=0;i<scores.length;i++) {
				sum+=scores[i];
			
			}
			return sum;//¹ÝÈ¯
		}//method close

}//class close
