package pk17.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Comparator : Override된 클래스는 오름차순으로 되있으므로 
//내림차순으로 재정의 하기 위한 목적
//사용조건 : 
//1. 반드시 기본생성자가 구현 되어 있어야함
//2. hip메모리 생성시 hip메모리를 하나 더 선언한다

class MyClass implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2))*-1;//내림차순
		//return (s1.compareTo(s2));//오름차순
	}
	
}

public class ComparatorTest2 {
	
	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>(new MyClass());
		set.add("이태주");
		set.add("한승수");
		set.add("윤근혁");
		
		System.out.println(set);
	}

}
