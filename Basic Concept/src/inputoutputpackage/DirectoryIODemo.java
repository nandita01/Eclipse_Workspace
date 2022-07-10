package inputoutputpackage;

import java.io.File;
import java.io.IOException;

public class DirectoryIODemo {

	public static void main(String[] args) throws IOException{
//		File f=new File("NanditaDoc");
//		f.mkdir();
//		File f1=new File("NanditaDoc","htmlfile.txt");
//		File f1=new File(f1."htmlfile.txt");
		File f=new File("NanditaDoc.txt");
		System.out.println(f.exists());
		//f.createNewFile();
		f.createNewFile();
	
	}

}
