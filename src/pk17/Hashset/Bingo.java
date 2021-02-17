package pk17.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>();
		int[][] board=new int[5][5];
		
		for (int i = 0;set.size()<25; i++) {//가져오는 숫자 개수
			set.add(new Random().nextInt(50)+1);//가져오는 숫자 범위
		}//Set구조는 ArrayList와는 다르게 인덱스로 접근이 불가능하므로
		//Iterator라는 반복자로 전환
		Iterator it=set.iterator();
		
		for (int i = 0; i <board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]=(Integer)it.next();
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
	}

}
