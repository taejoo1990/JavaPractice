package pk12;

//��ӹ��� Calc �߻�Ŭ�������� �Ϻθ� �����ǹǷ� �߻�Ŭ����
//Ÿ�Ի�� 
public abstract class Calculator implements Calc{
//interface�� ��� ����� �Ұ�� extends�� ��� ���ϰ� implements�� �����
//implements�� extends�� ��� �������� �־�
	
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
