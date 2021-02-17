package pk09;

//��ĳ����
class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
}

class Human extends Animal{ //extends : Is - A���� (��Ӱ���)
	
	public void move() {
		System.out.println("����� �ι߷� �����Դϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void fiying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
	
}


public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		aTest.moveAniml(new Human());//Human->Animal
		aTest.moveAniml(new Tiger());//Tiger->Animal
		aTest.moveAniml(new Eagle());//Eagle->Animal
												//(Animal�� ��� �޾����Ƿ� ���� �� ��ĳ����)

	}

	public void moveAniml(Animal animal) {//�Ű� ������ �ڷ����� ���� Ŭ����
		animal.move();//������ �� �޼ҵ�
	}
}
