package pk15;

import java.util.StringTokenizer;

public class A_09StTokenizerTest {

	public static void main(String[] args) {
		
		String str="Have a Nice Day";//���
		
		
		//StringTokenizer(�ڸ��� ���� ���ڿ�, �ڸ��� ������ �Ǵ� ����,
		//�ڸ��� ������ ������ ����(true, false))
		//StringTokenizer�� ��ü
		
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		//obj.hasMoreTokens(); //���� ��ū ���� Ȯ��
		//obj.nextToken();//���� ��ū�� �޾ƿ�
		
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
		
	}

}
