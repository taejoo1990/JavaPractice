package pk12;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

	Scanner sc =new Scanner(System.in);
		// System.in.read() : �ֿܼ� �Է¹ޱ� ��� �̷°��� �ƽ�Ű�ڵ尪
		// char ch=(char)System.in.read(); //�������� ����
		//int ch = System.in.read();
		
		
		while (true) {
			System.out.println();
			System.out.println("R or r : �Ѹ� ���ʷ� �Ҵ�");
			System.out.println("L or l : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
			System.out.println("P or p : ���� skill ���� ���� ���� �������� �Ҵ�");
			System.out.println("S or s : ����");	
			System.out.print("��ȭ ��� �Ҵ� ����� �����ϼ��� : ");
			String mun =sc.nextLine();
			//��Ʈ���� ���� ���ڸ� ������
			int ch=mun.charAt(0);//charAt(0):String->ACSII
			//�ƽ�Ű�ڵ�� ��ȯ
			Scheduler s1 = null;//�ΰ����� ���������� ��ӹ��� �ڷḦ ������ �ü��ִ�.
			
			//��ü��  ����
			if (ch == 'R' || ch == 'r') {
				s1 = new RoundRobin();
				//r�� ������ RoundRobin��ü ������ �ؼ� ã�ƺ�
			} else if (ch == 'L' || ch == 'l') {
				s1 = new LeastJob();
				//l�� ������ LeastJob��ü ������ �ؼ� ã�ƺ�
			} else if (ch == 'P' || ch == 'p') {
				s1 = new PriorityAllocation();
				//p�� ������PriorityAllocation��ü ������ �ؼ� ã�ƺ�
			}else if(ch == 'S' || ch=='s') {
				System.out.println("�ý��� ����");
				break;
				//s�� ������ ���Ϲ��� ������
			}else {
				System.out.println("�߸� �����̽��ϴ�.");
				continue;//����
			}//������ ���ڸ� �Է����� ���Ұ�� �ٽ� ��������
			s1.getNextCall();
			s1.sendCallToAgebt();
		}

	}

}
