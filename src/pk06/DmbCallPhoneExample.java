package pk06;

public class DmbCallPhoneExample {

	public static void main(String[] args) {
		DmbCallPhone dmb=new DmbCallPhone("�ڹ���", "����", 10);
		//�̹� CallPhone���� ���� ��ӹ���DmbCallPhone �ֱ⿡ 
		//DmbCallPhone�� �޸𸮸� �Ҵ��ϸ� �ȴ�.
		dmb.model="�ڹ���";
		dmb.color="����";
		dmb.channel=10;
		System.out.println("��: "+dmb.model+ "\n����: "+dmb.color
				+"\nä��: "+dmb.channel);
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmb.sendVoice("��~ �� �ݰ����ϴ�.");
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.channelChangeDMB(12);
		dmb.turnOffDMB();
		

	}

}
