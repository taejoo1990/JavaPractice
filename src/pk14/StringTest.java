package pk14;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everyBoby!";//2
		String str2="Haver a nice Day!";//3
		
		str=str1+str2;
		System.out.println(str);
		//���� �̾ ���
		System.out.println(str1.concat(str2));
		
		System.out.println("str1���ڼ� : "+str1.length());
		System.out.println("str2���ڼ� : "+str2.length());

		System.out.println("str1������ġ : "+str1.indexOf('B'));
		System.out.println("str2������ġ : "+str2.indexOf('D'));

		System.out.println("str1��� �ҹ��ڷ� : "+str1.toLowerCase());
		System.out.println("str2��� �빮�ڷ� : "+str2.toLowerCase());
		System.out.println(str1.substring(0,2));//0���� �����ؼ� 2���� �д´�
		System.out.println(str1.substring(3,12));//3���� �����ؼ� 12���� �д´�
		System.out.println(str2.substring(8,12));//8���� �����ؼ� 12���� �д´�
	}

}
