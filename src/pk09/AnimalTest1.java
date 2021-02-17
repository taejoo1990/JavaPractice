package pk09;

//업캐스팅
class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{ //extends : Is - A관계 (상속관계)
	
	public void move() {
		System.out.println("사람이 두발로 움직입니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void fiying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
}


public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest=new AnimalTest1();
		aTest.moveAniml(new Human());//Human->Animal
		aTest.moveAniml(new Tiger());//Tiger->Animal
		aTest.moveAniml(new Eagle());//Eagle->Animal
												//(Animal을 상속 받았으므로 가능 즉 업캐스팅)

	}

	public void moveAniml(Animal animal) {//매개 변수의 자료형이 상위 클래스
		animal.move();//재정의 된 메소드
	}
}
