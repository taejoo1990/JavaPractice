package pk06;

public class TimeTable {
	
	public void showTable(int num) {
		
		System.out.println(num + "´Ü");
		
		for(int i=1;i<=9;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

}
