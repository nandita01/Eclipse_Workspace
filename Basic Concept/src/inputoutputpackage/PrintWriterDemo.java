package inputoutputpackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args)throws IOException {
	FileWriter fw=new FileWriter("javafiles.txt");
	PrintWriter pw=new PrintWriter(fw);
	fw.write(100);
	pw.println(100);
	pw.println("Nandita");
	pw.println(true);
	pw.println('c');
	pw.flush();
	pw.close();
	
	
	
	}

}
