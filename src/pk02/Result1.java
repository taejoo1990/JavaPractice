package pk02;

public class Result1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		�������� �ִ�.
		��,���,�������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ����
		5��,7��,5��
		
		���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�, �ð���
		��ü ������ ��� ���� ������ ���
		��հ��� ���� ������ float���� �����Ұ�
		*/
		
		int pear=5;
		int apple=7;
		int orange=5;
	
		int fruitTotal=pear+apple+orange;
		System.out.println(fruitTotal);
		
		float avarage=fruitTotal / 24f;
		System.out.println("�ð��� ��� ���� ���� : "+ avarage + "��");
		
		
		//���� ���̸� ���Ͻÿ� (������* ������ * 3.14) : �������� 10
		
		int a=10;
		
		float c=a * a * 3.14f;
		System.out.println(c + "cm");
		
		//���� �����ڸ� �̿��Ͽ� score��90���� ũ��'A' �� score��80���� ũ��'B' �� �������� 'C'
		
		
		 int score1 = 85;
	     char result;
	        
	     result = (score1 > 90) ? 'A' : (score1>80) ? 'B' : 'C';
	        
	     System.out.println(result);
	        


	}

}
