package pk14;

import java.net.StandardSocketOptions;

public class ArrayCloneTest {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2;

		arr2=arr1.clone();
		
		System.out.println("*****����� arr2�迭***** ");
		
		for(int num:arr2) {
			System.out.print(num+" ");
		}
	System.out.println();
	
		arr2[3] = 0;// arr2�� ��Ұ� ����
		System.out.println("*****������ arr2�迭***** ");
		for (int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("*****������ arr2�迭***** ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}
	
	}

}
