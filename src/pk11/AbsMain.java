package pk11;

public class AbsMain {

	public static void main(String[] args) {
		
		//AbsEx a1=new AbsEx(); //¿À·ù
		AbsChild ac=new AbsChild();
		
		ac.setValue(20);
		System.out.println(ac.getValue());

	}

}
