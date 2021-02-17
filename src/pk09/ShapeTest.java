package pk09;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("도형을 그립니다.");
	}
}

class Circle extends Shape{
	
	@Override//어노테이션
	void draw() {
		System.out.println("draw Circle");
		super.draw();//도형을 그립니다. 부모님 생성자를 읽고 자기거를 읽는다
	}
	
	void circle() {
	System.out.println("원 입니다.");

	}

}
//사각형 Override / Rectangle
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Rectangle");
		super.draw();//도형을 그립니다. 부모님 생성자를 읽고 자기거를 읽는다
	}

	void rectangle() {
		System.out.println("사각형 입니다.");

	}
}
//삼각형 Override / Triangle
class Triangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Triangle");
		super.draw();//도형을 그립니다. 부모님 생성자를 읽고 자기거를 읽는다
	}

	void triangle() {
		System.out.println("삼각형 입니다.");

	}
}



public class ShapeTest {
	
	ArrayList<Shape> sList=new ArrayList<Shape>();
	//type과 size 제한이 없음

	public static void main(String[] args) {
		
		ShapeTest sTest=new ShapeTest();
		System.out.println("==객체생성과 오버라이딩 메소드 호출==");
		sTest.addShape();
		System.out.println("==세분화된 관리를 위한 다운 캐스팅==");
		sTest.testCasting();

	}
	
	//총괄하기 위한 업캐스팅
	public void addShape() {
		sList.add(new Circle()); //ArrayList에 각각의 객체 추가되면서
		sList.add(new Rectangle());//(Shape 타입으로 업캐스팅(형 변환))
		sList.add(new Triangle());
		
		for(Shape s: sList) {
			s.draw();
		}//다운캐스팅: 상속해준 클래스 add에서 서브클래스를 빼낸다
	     //업캐스팅: 상속해준 클래스에 서브클래스를 add에 넣어준다
	}
	
	//다운캐스팅
	public void testCasting() {
		
		for (int i=0;i<sList.size();i++) {//모든 배열 항목들을 하나씩 골면서 가져옴
			
			Shape s=sList.get(i); //일단 Shape 타입으로 가져올수 밖에 없음
			if(s instanceof Circle) {//Shape 안에 Circle이 있다면~
				Circle c=(Circle)s;//Circle로 다운 캐스팅
				c.circle();
				
			}else if(s instanceof Rectangle) {
				Rectangle r=(Rectangle)s;
				r.rectangle();
			
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s;
				t.triangle();
				
			}else
				System.out.println("지원되지 않는 타입 입니다.");
			
		}
		
	}
	
}
