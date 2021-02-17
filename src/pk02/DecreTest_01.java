package pk02;

public class DecreTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------");
		x++;//11
		++x;//12
		System.out.println("x = " + x); //12
		
		System.out.println("-----------");
		y--;//10
		--y;//9
		System.out.println("y = " + y); //8
		
		System.out.println("-----------");
		z = x++;
		System.out.println("z = " + z); //12
		System.out.println("x = " + x); //13
		
		System.out.println("-----------");
		z = ++x + y++;
		//  15     8(x는더하고 옮겨서 15 y는 옮기고 더해서 8)
		System.out.println("z = " + x); //23
		System.out.println("x = " + x); //15
		System.out.println("y = " + x); //9

	}

}
