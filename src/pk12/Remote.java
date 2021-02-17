package pk12;

public interface Remote {

	//상수
	int MAX_VOLUME=10;//public static final=> Remote.MAX_VOLUME
	int MIN_VOLUME=0;
	
	//추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
