package pk09;

public class InheritanceTest {

	public static void main(String[] args) {

		StrawBerry obj=new StrawBerry();
		
		obj.set1("Berry��", "����");//Fruit���� �����ž�
		obj.set2("����", "��");//Berry���� �����ž�
		obj.set3("����", 5000);//StrawBerry���� �����ž�
		
		obj.Disp1();
		obj.Disp2();
		obj.Disp3();

	}

}
