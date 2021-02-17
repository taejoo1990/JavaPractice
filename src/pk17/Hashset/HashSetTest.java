package pk17.Hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//equals와 hashcode가 override된 String Type
	HashSet<String> hs=new HashSet<>();
//해쉬셋사용시 중복을 허용하지 않는다
//또한 정렬되있지않음 마구잡이 출력
	hs.add(new String("신박한"));
	hs.add(new String("이름이"));
	hs.add(new String("없나"));
	hs.add(new String("싶은데"));
	//hs.add(new String("대충"));

	boolean b1=hs.add(new String("대충"));
	//새로운 값이 들어온것이기에 true
	System.out.println(b1);
	
	System.out.println(hs);
	//이미 들어와있는 값이 있기에 중복이 안되므로 false
	boolean b2=hs.add(new String("대충"));
	//hs.add(new String("대충"));
	System.out.println(b2);

	System.out.println(hs);
	
	}

}
