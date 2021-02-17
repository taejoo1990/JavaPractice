package pk07;

public class ThisTest {

	
	private int speed;
	private int age;
	private String RobotName;
	private String RobotNum;
	
	public ThisTest() {
		this(10,3,"Bab","20201204");//this : 생성자중에서 
		
		
	}
	public ThisTest(int speed,int age,String RobotName,String RobotNum) {
		this.age=age;
		this.speed=speed;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	public void Move() {
		speed+=20;
		System.out.println("speed : "+speed);
	}
	public void Stop() {
		speed=0;
		System.out.println("speed out: "+speed);
	}
	public void Age() {
		age+=2;
		System.out.println("age : "+age);
	}
	public void RName() {
		System.out.println("RobotName : "+RobotName);
	}
	public void RNum() {
		System.out.println("RobotNum : "+RobotNum);
	}
}
