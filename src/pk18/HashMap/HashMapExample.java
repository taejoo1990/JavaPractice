package pk18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		//객체 저장
		map.put("김지연",85);
		map.put("이지영",90);
		map.put("김한솔",80);//앞에있는 것을 key로 쓴다
		map.put("이지영",95);//key가 같으면 맨 마지막 Entry가 저장됨
		
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체 찾기
		System.out.println("\t이지영 : "+map.get("이지영"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet=map.keySet();
		Iterator<String> keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			
			Integer value=map.get(key);//key에 의해서 값을 저장
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//map.Entry : Map에 저장되어 있는 key-velue 다루기 위해 내부적으로 Entry인터페이스
		map.remove("이지영");
		System.out.println("총 Entry 수 : "+map.size());
		
		//Entry로 처리
		Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
		//반복해서 Map.Entry 얻고 키와 값도 얻어냄
		Iterator<Map.Entry<String,Integer>> entryIt=entrySet.iterator();
		
		//반복해서 map.entry얻고 키와값도 얻어냄
		while(entryIt.hasNext()) {
			Map.Entry<String,Integer> entry=entryIt.next();
			
			String key=entry.getKey();//key값 얻음
			Integer value=entry.getValue();//value 값 얻기
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//모든map.Entry 삭제
		map.clear();//맵은 중복시 마지막꺼를 저장//셋은 중복시 처음꺼를 저장
		System.out.println("총 Entry 수 : "+map.size());
	}

}
