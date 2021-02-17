package pk11;

public class AnimalExample {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		//자동 타입 변환
		Animal animal=null;
		animal=new Dog();//Dog클래스를 참조할 수 있는 메모리를 할당
		animal.sound();
		
		animal=new Cat();//Cat클래스를 참조할 수 있는 메모리를 할당
		animal.sound();
		//animal.age();//자식 클래스에만 있는 메소드이므로 참조가 안됨
		cat.age();
		System.out.println("------------");
		
		//인스턴스변수는 상속을 한 이상 주소 참조 가능

		//매개변수의 자동 타입변환 황용
		animalSound(dog);//animal이 dog에 상속되었기에 가능해
		animalSound(cat);//animal이 cat에 상속되었기에 가능해
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
