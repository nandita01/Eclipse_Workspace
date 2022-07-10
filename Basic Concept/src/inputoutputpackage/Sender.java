package inputoutputpackage;

import java.io.*;

public class Sender {

	public static void main(String[] args) throws Exception {
		SerialVersionDemo s1=new SerialVersionDemo();
		FileOutputStream fos=new FileOutputStream("serializablefile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		

	}

}
