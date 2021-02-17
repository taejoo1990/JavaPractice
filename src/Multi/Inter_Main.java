package Multi;

public class Inter_Main implements Inter_Menu3{
	
	public static void main(String[] args) {
		Inter_Main im=new Inter_Main();
		System.out.println("---만리장성 메뉴판---");
		
		Inter_Menu1 im1=im;//up
		Inter_Menu2 im2=im;
		Inter_Menu3 im3=im;
		
		System.out.println(im.jajag());
		//im1객체에서는 jjambbong() jajag()만 가능
		System.out.println("-----im1-----");
		System.out.println(im1.jajag());
		System.out.println(im1.jjambbong());
		//im2객체에서는 tangsuyuck()만 가능
		System.out.println("-----im2-----");
		System.out.println(im2.tangsuyuck());
		//im3객체에서는 tangsuyuck()만 가능
		System.out.println("-----im3-----");
		System.out.println(im3.boggembab());
		
	}

	@Override
	public String jajag() {
		return "장자라장자자장면";
	}

	@Override
	public String jjambbong() {
		return "면따로 국물따로 짬봉";
	}

	@Override
	public String tangsuyuck() {
		return "오빠 당연히 찍먹이겠죠?";
	}

	@Override
	public String boggembab() {
		return "밥은 역시 뽀끔밥";
	}

}
