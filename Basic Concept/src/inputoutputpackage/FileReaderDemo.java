package inputoutputpackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("NanditaDoc.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		System.out.println("############");
		FileReader fr1=new FileReader("NanditaDoc.txt");
		int i=fr1.read();
		while(i !=-1)
		{
			System.out.print((char)i);
			i=fr1.read();
		}
		
		

	}

}
