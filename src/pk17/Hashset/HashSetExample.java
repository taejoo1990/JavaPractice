package pk17.Hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<User> set=new HashSet<>();
		
		set.add(new User("������",25));
		set.add(new User("�̼���",27));
		set.add(new User("�̼���",26));

		System.out.println(set);
		System.out.println("�� ��ü�� : "+set.size());
	}

}
