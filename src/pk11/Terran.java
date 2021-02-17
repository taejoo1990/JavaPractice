package pk11;

public class Terran extends Unit{

	//공중유닛이면 true, 지상유닛false
	boolean fly;
	
	public Terran(String name, int energy, boolean fly) {
		this.name=name;
		this.energy=energy;
		this.fly=fly;
	}
	
	@Override
	public void decEnergy() {
		energy -=3;
		
	}

}
