package inputoutputpackage;

import java.io.File;

public class ShowFilesDemo {

	public static void main(String[] args) {
		int count=0;
		File f=new File("H:\\Java Prestige Point");
		String[]s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			count++;
			System.out.println(s1);
			System.out.println("The total Number:"+count);
		}
	}

}
