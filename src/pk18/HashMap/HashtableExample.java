package pk18.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		
		Map<String, String> map=new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� : ");
			String id=sc.next();
			
			System.out.print("��й�ȣ : ");
			String password=sc.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				//���࿡ ���ο� ���� ���ϴ� ���̵� �ִ�?
				if(map.get(id).equals(password)) {
				//�ִٸ� �ű⿡ �н����嵵 ���� ���ٸ� �Ʒ��� ����Ұž�
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {//�н����尡 ���� �ʴٸ� �Ʒ��� ����Ұž�
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}//���̵� Ʋ���ٸ� �̰��� ����Ұž�
		}
	}
}
