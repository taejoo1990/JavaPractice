package pk17.Hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<User> set=new HashSet<>();
		
		set.add(new User("À±±ÙÇõ",25));
		set.add(new User("ÀÌ¼öÁø",27));
		set.add(new User("ÀÌ¼öÁø",26));

		System.out.println(set);
		System.out.println("ÃÑ °´Ã¼¼ö : "+set.size());
	}

}
