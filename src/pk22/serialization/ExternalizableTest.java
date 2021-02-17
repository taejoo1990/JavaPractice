package pk22.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	
	String name;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=in.readUTF();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}






public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		Dog myDog=new Dog();
		myDog.name="백설";
		//자바9이상
		/*FileOutputStream fos=new FileOutputStream("external.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		try(){
			
		}catch (Exception e) {
		
		}*/
		try(FileOutputStream fos=new FileOutputStream("external.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			
			oos.writeObject(myDog);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("external.txt");
				ObjectInputStream ois=new ObjectInputStream(fis)) {
			
			Dog dog=(Dog)ois.readObject();
			System.out.println(dog);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
