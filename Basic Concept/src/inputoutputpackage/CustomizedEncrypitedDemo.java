package inputoutputpackage;
import java.io.*;
class Regular implements Serializable
{
	String username="Neha";
	 transient String pwd="Divi";
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception
	{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
		
	}
	}

public class CustomizedEncrypitedDemo {

	public static void main(String[] args) throws Exception {
		Regular r1=new Regular();
		FileOutputStream fos=new FileOutputStream("serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(r1);
		
		FileInputStream fis=new FileInputStream("serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Regular r2=(Regular)ois.readObject();
		System.out.println(r2.username+"..."+r2.pwd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
