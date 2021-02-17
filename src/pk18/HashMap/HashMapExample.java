package pk18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		//��ü ����
		map.put("������",85);
		map.put("������",90);
		map.put("���Ѽ�",80);//�տ��ִ� ���� key�� ����
		map.put("������",95);//key�� ������ �� ������ Entry�� �����
		
		System.out.println("�� Entry �� : "+map.size());
		
		//��ü ã��
		System.out.println("\t������ : "+map.get("������"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet=map.keySet();
		Iterator<String> keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			
			Integer value=map.get(key);//key�� ���ؼ� ���� ����
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//map.Entry : Map�� ����Ǿ� �ִ� key-velue �ٷ�� ���� ���������� Entry�������̽�
		map.remove("������");
		System.out.println("�� Entry �� : "+map.size());
		
		//Entry�� ó��
		Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
		//�ݺ��ؼ� Map.Entry ��� Ű�� ���� ��
		Iterator<Map.Entry<String,Integer>> entryIt=entrySet.iterator();
		
		//�ݺ��ؼ� map.entry��� Ű�Ͱ��� ��
		while(entryIt.hasNext()) {
			Map.Entry<String,Integer> entry=entryIt.next();
			
			String key=entry.getKey();//key�� ����
			Integer value=entry.getValue();//value �� ���
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//���map.Entry ����
		map.clear();//���� �ߺ��� ���������� ����//���� �ߺ��� ó������ ����
		System.out.println("�� Entry �� : "+map.size());
	}

}
