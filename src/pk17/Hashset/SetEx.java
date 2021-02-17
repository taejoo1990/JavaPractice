package pk17.Hashset;

import java.util.HashSet;
import java.util.Random;

public class SetEx {

	public static void main(String[] args) {
		//Set은 중복을 허용하지 않는다
			//-HashSet : 정렬되있지않음 마구잡이 출력
			//-TreeSet : 오름차순
		
		HashSet<Integer> hs=new HashSet<>();
		
		while (true) {
			int v=(int)(Math.random()*45+1);
			//int v=new Random().nextInt(45)+1;
			
			hs.add(v);
			
			if(hs.size()>=6)
				break;
			
		}
		System.out.println(hs);
	}

}
