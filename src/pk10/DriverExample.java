package pk10;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver d=new Driver();
		//����̹��� �ý� ���� ��ü���� �� ����̹��� ���ؼ� ������ �ýø� �д´�
		Taxi t=new Taxi();
		Bus b=new Bus();
		
		d.drive(t);
		d.drive(b);
		//driver�� ���ؼ� ������ �ýø� �����ž�
		t.run();
		b.run();

	}

}
