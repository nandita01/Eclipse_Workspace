package inputoutputpackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		// TRUE FOR APPEND
		FileWriter fw=new FileWriter("NanditaDoc.txt");//("NanditaDoc.txt",true);
		//fw.write("p");
		fw.write(112);
		fw.write("restige\npoint");
		//fw.write("null");
		fw.write("\n ");
		char[] ch= {'x','y','z'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		
		

	}

}
