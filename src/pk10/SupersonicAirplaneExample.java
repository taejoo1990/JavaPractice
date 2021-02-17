package pk10;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeOff();
		sa.fiy();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fiy();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fiy();
		sa.land();

	}

}
