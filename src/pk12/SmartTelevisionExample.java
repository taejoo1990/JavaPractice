package pk12;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		SmartTelevision tv=new SmartTelevision();
		
		tv.turnOn();
		tv.search("¸ÀÀÖ´Â ³à¼®µé");
		tv.setVolume(17);
		tv.setVolume(-2);
		tv.setVolume(8);
		tv.turnOff();

	}

}
