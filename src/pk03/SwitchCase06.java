package pk03;

public class SwitchCase06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random : 8~18��
		// 8 : ���, 9 :ȸ��, 10 : ����, 16 : �ܱ�, 18 : ���
		int time = (int) (Math.random() * 8) + 10;

		System.out.println("[����ð�] : " + time + "��");

		switch (time) {
		case 8:
			System.out.println("���");
			break;
		case 9:
			System.out.println("ȸ��");
			break;
		case 10:
			System.out.println("����");
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			System.out.println("�ܱ�");
			break;
		case 17:
			break;
		case 18:
			System.out.println("���");
			break;
		default:
			System.out.println("���� ���� �ð��Դϴ�");
		}

	}

}
