package pk18.HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapExample {

	public static void main(String[] args) {
		
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		map.put(new Student(1, "±èÁö¿¬"),95);
		map.put(new Student(1, "±èÁö¿¬"),95);
		map.put(new Student(2, "ÀÌÁö¿¬"),85);
		
		System.out.println("ÃÑ Entry ¼ö : "+map.size());

	}

}
