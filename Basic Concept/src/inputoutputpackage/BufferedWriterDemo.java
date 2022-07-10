package inputoutputpackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("durga123");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("nandita");
		bw.newLine();
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
	
		bw.flush();
		bw.close();
		
	}

}
