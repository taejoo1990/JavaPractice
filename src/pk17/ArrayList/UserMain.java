package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr=new ArrayList<>();
		
		
		
		
		outer:while(true) {
			
			System.out.print("���̵� ���� : ");
			Scanner sc=new Scanner(System.in);
			
			//���̵� �Է��Ҷ����� ���ο� UserInfo
			UserInfo ui=new UserInfo();
			ui.setId(sc.next());
			
			//���̵� �ߺ�üũ
			for (int i = 0; i < arr.size(); i++) {
				if(arr.get(i).getId().equals(ui.getId())) {//(ui.getid().equals(arr.get(i).getId())
					//����Ʈ�� ������ִ� ���̵�� ��ĵ���� ���� ���̵� ���Ͽ� �ߺ��� ����
					System.out.println("���̵� �ߺ��Դϴ�.");
					continue outer;//�ߺ��ɰ�� �ƿ��ͷ� ���ư��� �ٽ� �ݺ�����
				}
					
			}
			
			System.out.print("��й�ȣ ���� : ");
			ui.setPwd(sc.nextInt());
			
			arr.add(ui);
			
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("-----------------------------");
			}
			
		}
		
	}

}