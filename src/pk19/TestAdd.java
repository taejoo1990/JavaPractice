package pk19;

public class TestAdd {

	public static void main(String[] args) {
		//구현부
		Add addF=(x,y) -> x+y;
		
		//실행부
		System.out.println(addF.add(3, 5));
		//구현부 없이 사용가능
	}

}
