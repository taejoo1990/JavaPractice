package pk12;

//���� ���(Interface)
public class SmartTelevision implements Remote, Searchable {

	private int volume;
	

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
		
	}
	@Override
	public void setVolume(int volume) {
		if (volume>Remote.MAX_VOLUME) {//������ �ƽ����� ���ٸ�
			this.volume=Remote.MAX_VOLUME;//������ �ƽ��� ������
		}else if(volume<Remote.MIN_VOLUME) {//������ �̴ϸغ��� ���ٸ�
			this.volume=Remote.MIN_VOLUME;//�̴ϸ����� ������
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ���� : "+ this.volume);
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
		
	}
}
