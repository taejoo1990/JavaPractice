package Algo_test;

public class ReverseArray {
	
	//배열요소 a[idx1]과 a[idx2]의 값을 바꿈
	
	static void swap(int[] a, int idx1,int idx2) {
		
		int	temp=a[idx1];
		//idx1을temp에 넘길거야
		a[idx1]=a[idx2];
		//idx2를 idx1로 넘길거야
		a[idx2]=temp;
		//temp를 idx2로 넘길거야
	}
	/*a[0]a[1]a[2]a[3]a[4]
	    5    2	 8   9   7*/
	
	
	//배열 a의 요소를 역순으로 정렬
	
	static void reverse(int[] a) {
		
		for(int i=0;i<a.length/2;i++)
		//a배열에 랭스를 절반까지 +1하면서 인식할거야(정수)a0~1(홀수는 2.5이기에 정수2)
			swap(a,i,a.length-i-1);//메소드에서 메소드를 호출
		//a배열에 랭스를 뒤에서부터 절반까지 -1 하면서 인식할거야(정수)a4~3
	}//스왑으로 인해 첫번째와 다섯번째의 위치를 바꾸고
	//두번째와 네번째를 위치를 바꿈으로 인해 역순으로 정렬
	//[5<=>7][2<=>9]

}
