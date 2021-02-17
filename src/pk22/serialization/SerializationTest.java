package pk22.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
   /*
		ObjectOutputStream 보조스트림을 사용하기 위한 ID
	*/
	private static final long serialVersionUID=1L;
	
   String name; //transient 보안으로 null로 숨김
   String job;
   
   //obj보조스트림 사용시 무조건 기본 생성자 명시
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
	   
	   Person personAhn=new Person("윤근혁", "대표이사");
	   Person personKim=new Person("장미란", "상무이사");
		
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
