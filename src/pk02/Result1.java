package pk02;

public class Result1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		과수원이 있다.
		배,사과,오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		5개,7개,5개
		
		과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당
		전체 과일의 평균 생산 갯수를 출력
		평균값을 담은 변수는 float으로 지정할것
		*/
		
		int pear=5;
		int apple=7;
		int orange=5;
	
		int fruitTotal=pear+apple+orange;
		System.out.println(fruitTotal);
		
		float avarage=fruitTotal / 24f;
		System.out.println("시간당 평규 생산 갯수 : "+ avarage + "개");
		
		
		//원의 넓이를 구하시오 (반지름* 반지름 * 3.14) : 반지름은 10
		
		int a=10;
		
		float c=a * a * 3.14f;
		System.out.println(c + "cm");
		
		//삼항 연산자를 이용하여 score가90보다 크면'A' 고 score가80보다 크면'B' 고 나머지는 'C'
		
		
		 int score1 = 85;
	     char result;
	        
	     result = (score1 > 90) ? 'A' : (score1>80) ? 'B' : 'C';
	        
	     System.out.println(result);
	        


	}

}
