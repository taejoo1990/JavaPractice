package Multi;

public class Inter_Main implements Inter_Menu3{
	
	public static void main(String[] args) {
		Inter_Main im=new Inter_Main();
		System.out.println("---�����强 �޴���---");
		
		Inter_Menu1 im1=im;//up
		Inter_Menu2 im2=im;
		Inter_Menu3 im3=im;
		
		System.out.println(im.jajag());
		//im1��ü������ jjambbong() jajag()�� ����
		System.out.println("-----im1-----");
		System.out.println(im1.jajag());
		System.out.println(im1.jjambbong());
		//im2��ü������ tangsuyuck()�� ����
		System.out.println("-----im2-----");
		System.out.println(im2.tangsuyuck());
		//im3��ü������ tangsuyuck()�� ����
		System.out.println("-----im3-----");
		System.out.println(im3.boggembab());
		
	}

	@Override
	public String jajag() {
		return "���ڶ����������";
	}

	@Override
	public String jjambbong() {
		return "����� �������� «��";
	}

	@Override
	public String tangsuyuck() {
		return "���� �翬�� ����̰���?";
	}

	@Override
	public String boggembab() {
		return "���� ���� �ǲ���";
	}

}
