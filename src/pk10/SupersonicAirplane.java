package pk10;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;

	@Override
	public void fiy() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		}else {//Airplane 객체의 fly()메서드
			super.fiy();
		}
		
	}

}
