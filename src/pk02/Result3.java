package pk02;

public class Result3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항 연산자를 이용하여 score가 90보다 크면 'A' 고 score가 80보다 크면 'B' 고 나머지는 'C'
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
		
	}

}
