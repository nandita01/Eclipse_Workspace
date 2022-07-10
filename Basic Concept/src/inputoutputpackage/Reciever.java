package inputoutputpackage;
import java.io.*;



public class Reciever {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("serializablefile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SerialVersionDemo s2=(SerialVersionDemo)ois.readObject();
		System.out.println(s2.i+"......"+s2.j);
		ois.close();

	}

}
