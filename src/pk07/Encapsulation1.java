package pk07;

public class Encapsulation1 {

	private int Side;
	private int Height;
	
	public Encapsulation1() {
		Side=0;
		Height=0;
	}
	

	public int cal_Area(int S, int H) {
		this.Side=S;
		this.Height=H;
		int W=S*H;
		return W; //return(S*H)
		
		
		
	}	
}
