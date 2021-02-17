package pk06;

public class DmbCallPhone extends CallPhone{
	//DmbCallPhone+CallPhone합친거다
	//필드=속성=멤버변수
	int channel;
	
	//생성자
	public DmbCallPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메소드
	
	void turnOnDmb() {
		System.out.println("채널"+ channel+"번 DMB 방송 수신을 시작합니다");
	}
	
	void channelChangeDMB(int channel) {
		this.channel=channel;
		System.out.println("채널"+ channel +"번으로 바뀝니다");
	}
	void turnOffDMB() {
		System.out.println("DMB 방송 수신을 종료합니다");
	}
	
	
}
