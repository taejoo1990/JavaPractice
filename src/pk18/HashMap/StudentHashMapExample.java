package pk18.HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapExample {

	public static void main(String[] args) {
		
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		map.put(new Student(1, "������"),95);
		map.put(new Student(1, "������"),95);
		map.put(new Student(2, "������"),85);
		
		System.out.println("�� Entry �� : "+map.size());

	}

}
