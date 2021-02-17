package pk10;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver d=new Driver();
		//드라이버와 택시 버스 객체생성 후 드라이버를 통해서 버스와 택시를 읽는다
		Taxi t=new Taxi();
		Bus b=new Bus();
		
		d.drive(t);
		d.drive(b);
		//driver를 통해서 버스와 택시를 읽을거야
		t.run();
		b.run();

	}

}
