package pk02;

public class Result2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���̸� ���Ͻÿ� (������* ������ * 3.14) : �������� 10
		
		/*int a=10;         ���� �Ѱ�
				
		float c=a * a * 3.14f;
		System.out.println(c + "cm");*/
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("���� ����:" + var4);

	}

}
