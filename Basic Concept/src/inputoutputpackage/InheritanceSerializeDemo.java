package inputoutputpackage;
import java.io.*;
class Light implements Serializable {
	int i=20;
}
class Bulb extends Light
{
	int j=40;
}

public class InheritanceSerializeDemo {


	public static void main(String[] args) throws Exception {
		Bulb b1=new Bulb();
		System.out.println("Serialization= "+b1.i+"..."+b1.j);
		FileOutputStream fos=new FileOutputStream("serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(b1);

		FileInputStream fis=new FileInputStream("serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Bulb b2=(Bulb)ois.readObject();
		System.out.println("Deserialization= "+b2.i+"...."+b2.j);



	}

}
