package pk12;

public interface Remote {

	//���
	int MAX_VOLUME=10;//public static final=> Remote.MAX_VOLUME
	int MIN_VOLUME=0;
	
	//�߻�޼���
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
