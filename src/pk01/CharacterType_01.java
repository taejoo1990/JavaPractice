package pk01;

public class CharacterType_01 {

	public static void main(String[] args) {

		int a=90; //ASCII 65 ~ 90 (A ~ Z)
		int b=97; //ASCII 97 ~ 122 (a ~ z)
		
		char a2=65;
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println((char)a2); //A
		System.out.println((int)a2); //65
		
		char ch1='วั';
		char ch2='\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		

	}

}
