package pk11;

public class AnimalExample {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		//�ڵ� Ÿ�� ��ȯ
		Animal animal=null;
		animal=new Dog();//DogŬ������ ������ �� �ִ� �޸𸮸� �Ҵ�
		animal.sound();
		
		animal=new Cat();//CatŬ������ ������ �� �ִ� �޸𸮸� �Ҵ�
		animal.sound();
		//animal.age();//�ڽ� Ŭ�������� �ִ� �޼ҵ��̹Ƿ� ������ �ȵ�
		cat.age();
		System.out.println("------------");
		
		//�ν��Ͻ������� ����� �� �̻� �ּ� ���� ����

		//�Ű������� �ڵ� Ÿ�Ժ�ȯ Ȳ��
		animalSound(dog);//animal�� dog�� ��ӵǾ��⿡ ������
		animalSound(cat);//animal�� cat�� ��ӵǾ��⿡ ������
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
