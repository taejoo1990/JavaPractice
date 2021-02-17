package pk06;

public class DmbCallPhoneExample {

	public static void main(String[] args) {
		DmbCallPhone dmb=new DmbCallPhone("자바폰", "검정", 10);
		//이미 CallPhone으로 부터 상속받은DmbCallPhone 있기에 
		//DmbCallPhone만 메모리를 할당하면 된다.
		dmb.model="자바폰";
		dmb.color="검정";
		dmb.channel=10;
		System.out.println("모델: "+dmb.model+ "\n색상: "+dmb.color
				+"\n채널: "+dmb.channel);
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmb.sendVoice("아~ 예 반갑습니다.");
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.channelChangeDMB(12);
		dmb.turnOffDMB();
		

	}

}
