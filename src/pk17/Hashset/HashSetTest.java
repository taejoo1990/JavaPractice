package pk17.Hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//equals�� hashcode�� override�� String Type
	HashSet<String> hs=new HashSet<>();
//�ؽ��»��� �ߺ��� ������� �ʴ´�
//���� ���ĵ��������� �������� ���
	hs.add(new String("�Ź���"));
	hs.add(new String("�̸���"));
	hs.add(new String("����"));
	hs.add(new String("������"));
	//hs.add(new String("����"));

	boolean b1=hs.add(new String("����"));
	//���ο� ���� ���°��̱⿡ true
	System.out.println(b1);
	
	System.out.println(hs);
	//�̹� �����ִ� ���� �ֱ⿡ �ߺ��� �ȵǹǷ� false
	boolean b2=hs.add(new String("����"));
	//hs.add(new String("����"));
	System.out.println(b2);

	System.out.println(hs);
	
	}

}
