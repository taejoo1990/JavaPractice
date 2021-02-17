package pk14;

public class Circle implements Cloneable{
	
	Point point; //객체 선언
	int radius; //반지름
	
	public Circle(int x, int y, int redius) {
		point=new Point(x, y); //객체 생성(hip)
		this.radius=redius;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원점은 "+point+"이고"+" 반지름은"+ radius+"입니다.";
	}
	
	//정보의 캡슐화
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
