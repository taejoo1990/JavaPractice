package pk02;

public class Result3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �����ڸ� �̿��Ͽ� score�� 90���� ũ�� 'A' �� score�� 80���� ũ�� 'B' �� �������� 'C'
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
		
		
	}

}
