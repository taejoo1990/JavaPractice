package pk04;

public class TowDimension01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6}}; //new int[]
			//System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {//青
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------");
		System.out.println(arr.length);//傈眉 青
		System.out.println(arr[0].length);//1青
		System.out.println(arr[1].length);//2青

	}

}
