package pk04;

public class TowDimension02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[2][3];
		int n=0;
		
		for(int i=0;i<arr.length;i++) {//행
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= ++n;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		System.out.println(arr.length);//전체 행
		System.out.println(arr[0].length);//1행
		System.out.println(arr[1].length);//2행
	}

}
