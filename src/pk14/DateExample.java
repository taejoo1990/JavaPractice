package pk14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now=new Date();
		
		//�⺻���� ��¥ ǥ��Ÿ��
		System.out.println(now);
		
		//String strNow1=(string)now; //�ٿ�ĳ������ �ȵ�
		String str="Hi".toString();//toString �̹� �������̵��� �Ǿ� ����
		System.out.println(str);
		
		String strNow1=now.toString();//Data--> String
		System.out.println("---------Date--------");
		System.out.println("������ ��¥ : "+strNow1);

		SimpleDateFormat sdt=new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		//���� ���س����� ���� ���缭 ���� �ʿ���� �κ��� �����ϸ� ��¾ȵ�
		String strnow2=sdt.format(now);//Date-->String
		System.out.println("---------SimpleDateForm--------");
		System.out.println(strnow2);
		
	}

}
