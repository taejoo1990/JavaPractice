package pk06;

public class DmbCallPhone extends CallPhone{
	//DmbCallPhone+CallPhone��ģ�Ŵ�
	//�ʵ�=�Ӽ�=�������
	int channel;
	
	//������
	public DmbCallPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//�޼ҵ�
	
	void turnOnDmb() {
		System.out.println("ä��"+ channel+"�� DMB ��� ������ �����մϴ�");
	}
	
	void channelChangeDMB(int channel) {
		this.channel=channel;
		System.out.println("ä��"+ channel +"������ �ٲ�ϴ�");
	}
	void turnOffDMB() {
		System.out.println("DMB ��� ������ �����մϴ�");
	}
	
	
}
