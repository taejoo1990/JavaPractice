package pk11;

public abstract class Unit {

	
	String name;//�̸�
	int energy;//ü��
	
	//������ ���ҵǴ� ������ ����
	public abstract void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
}
