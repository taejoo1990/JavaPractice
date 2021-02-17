package pk22.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
   /*
		ObjectOutputStream ������Ʈ���� ����ϱ� ���� ID
	*/
	private static final long serialVersionUID=1L;
	
   String name; //transient �������� null�� ����
   String job;
   
   //obj������Ʈ�� ���� ������ �⺻ ������ ���
   public Person() {}
   
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + "," + job;
	}
}



public class SerializationTest {

   public static void main(String[] args) {
	   
	   Person personAhn=new Person("������", "��ǥ�̻�");
	   Person personKim=new Person("��̶�", "���̻�");
		
	   try(FileOutputStream fos= new FileOutputStream("serial.out");
			   ObjectOutputStream oos= new ObjectOutputStream(fos)) {
		
		   oos.writeObject(personAhn);
		   oos.writeObject(personKim);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   try(FileInputStream fis= new FileInputStream("serial.out");
			   ObjectInputStream ois= new ObjectInputStream(fis)) {
		
		   Person p1=(Person)ois.readObject();
		   Person p2=(Person)ois.readObject();
		   
		   System.out.println(p1);
		   System.out.println(p2);
		   
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
