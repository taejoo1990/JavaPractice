package pk09;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}

class Circle extends Shape{
	
	@Override//������̼�
	void draw() {
		System.out.println("draw Circle");
		super.draw();//������ �׸��ϴ�. �θ�� �����ڸ� �а� �ڱ�Ÿ� �д´�
	}
	
	void circle() {
	System.out.println("�� �Դϴ�.");

	}

}
//�簢�� Override / Rectangle
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Rectangle");
		super.draw();//������ �׸��ϴ�. �θ�� �����ڸ� �а� �ڱ�Ÿ� �д´�
	}

	void rectangle() {
		System.out.println("�簢�� �Դϴ�.");

	}
}
//�ﰢ�� Override / Triangle
class Triangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Triangle");
		super.draw();//������ �׸��ϴ�. �θ�� �����ڸ� �а� �ڱ�Ÿ� �д´�
	}

	void triangle() {
		System.out.println("�ﰢ�� �Դϴ�.");

	}
}



public class ShapeTest {
	
	ArrayList<Shape> sList=new ArrayList<Shape>();
	//type�� size ������ ����

	public static void main(String[] args) {
		
		ShapeTest sTest=new ShapeTest();
		System.out.println("==��ü������ �������̵� �޼ҵ� ȣ��==");
		sTest.addShape();
		System.out.println("==����ȭ�� ������ ���� �ٿ� ĳ����==");
		sTest.testCasting();

	}
	
	//�Ѱ��ϱ� ���� ��ĳ����
	public void addShape() {
		sList.add(new Circle()); //ArrayList�� ������ ��ü �߰��Ǹ鼭
		sList.add(new Rectangle());//(Shape Ÿ������ ��ĳ����(�� ��ȯ))
		sList.add(new Triangle());
		
		for(Shape s: sList) {
			s.draw();
		}//�ٿ�ĳ����: ������� Ŭ���� add���� ����Ŭ������ ������
	     //��ĳ����: ������� Ŭ������ ����Ŭ������ add�� �־��ش�
	}
	
	//�ٿ�ĳ����
	public void testCasting() {
		
		for (int i=0;i<sList.size();i++) {//��� �迭 �׸���� �ϳ��� ��鼭 ������
			
			Shape s=sList.get(i); //�ϴ� Shape Ÿ������ �����ü� �ۿ� ����
			if(s instanceof Circle) {//Shape �ȿ� Circle�� �ִٸ�~
				Circle c=(Circle)s;//Circle�� �ٿ� ĳ����
				c.circle();
				
			}else if(s instanceof Rectangle) {
				Rectangle r=(Rectangle)s;
				r.rectangle();
			
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s;
				t.triangle();
				
			}else
				System.out.println("�������� �ʴ� Ÿ�� �Դϴ�.");
			
		}
		
	}
	
}
