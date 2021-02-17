package pk04;

public class ArguTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aVal;
		int bVal;
		int Tot;
		
		if(args.length==2) {
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}//if true
		else {
			aVal=0;
			bVal=0;
		}//if false
		Tot=aVal+bVal;
		System.out.println(Tot);

	}//if close

}//main close
