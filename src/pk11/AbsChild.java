package pk11;

public class AbsChild extends AdsEx{

	int age=10;
	
	@Override
	public void setValue(int n) {
		age +=n;
		
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return age;
	}

	

}
