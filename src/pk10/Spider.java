package pk10;

public class Spider extends Animal01{
	
	String web="슉슉";
	
	//접근제한은 부모것 보다 넓은 범위에서 변경이 가능
	@Override
	public int getEye() {
		return 6;
	}

	@Override
	public int getLeg() {
		return 8;
	}
	

}
