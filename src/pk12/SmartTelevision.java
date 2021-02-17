package pk12;

//다중 상속(Interface)
public class SmartTelevision implements Remote, Searchable {

	private int volume;
	

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}
	@Override
	public void setVolume(int volume) {
		if (volume>Remote.MAX_VOLUME) {//볼륨이 맥스보다 높다면
			this.volume=Remote.MAX_VOLUME;//볼륨을 맥스로 유지해
		}else if(volume<Remote.MIN_VOLUME) {//볼륨이 미니멈보다 낮다면
			this.volume=Remote.MIN_VOLUME;//미니멈으로 유지해
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 : "+ this.volume);
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}
}
