package pk04;

public class CharArrey02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] alpa=new char[26];
		char ch='A'; //65
				
		for(int i=0;i<alpa.length;i++, ch++) {
			alpa[i]=ch;
		}
		
		for(int i=0;i<alpa.length;i++) {
			System.out.println((int)alpa[i]+"=>"+alpa[i]);
		}

	}

}
