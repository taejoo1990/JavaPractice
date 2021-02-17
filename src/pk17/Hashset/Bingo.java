package pk17.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>();
		int[][] board=new int[5][5];
		
		for (int i = 0;set.size()<25; i++) {//�������� ���� ����
			set.add(new Random().nextInt(50)+1);//�������� ���� ����
		}//Set������ ArrayList�ʹ� �ٸ��� �ε����� ������ �Ұ����ϹǷ�
		//Iterator��� �ݺ��ڷ� ��ȯ
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
