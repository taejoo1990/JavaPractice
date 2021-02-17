package pk11;

public abstract class Unit {

	
	String name;//이름
	int energy;//체력
	
	//유닛의 감소되는 에너지 관리
	public abstract void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
}
