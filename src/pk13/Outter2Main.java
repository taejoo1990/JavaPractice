package pk13;

public class Outter2Main {
	
	public static void main(String[] args) {
		
		Outter2 ou=new Outter2();
		Outter2.Nested nested=ou.Nested();
		nested.print();
	}

}
