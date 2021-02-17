package pk07;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("ȫ�浿");
		Person p3=new Person("ȫ�浿",175,68);
		
		p1.Disp();
		System.out.println("---------------");
		p2.Disp();
		System.out.println("---------------");
		p3.Disp();

	}

}
