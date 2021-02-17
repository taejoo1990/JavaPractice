package pk07;

public class KoreanMain {

	public static void main(String[] args) {
		Korean k1=new Korean("자바", "20201204");
		System.out.println("k1.name : "+ k1.name);
		System.out.println("k1.ssn : "+ k1.ssn);
		System.out.println("nation : "+ k1.nation);
		//기본생성자에 설정을 해논 것을 변경할경우 위와 같이 main에서 변경을 하고 출력할시
		//변경되어 출력된다
	}

}
