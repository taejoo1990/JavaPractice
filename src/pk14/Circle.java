package pk14;

public class Circle implements Cloneable{
	
	Point point; //��ü ����
	int radius; //������
	
	public Circle(int x, int y, int redius) {
		point=new Point(x, y); //��ü ����(hip)
		this.radius=redius;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������ "+point+"�̰�"+" ��������"+ radius+"�Դϴ�.";
	}
	
	//������ ĸ��ȭ
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
