package inputoutputpackage;
import java.io.*;
//import java.io.EOFException;
public class ExternalizableDemo  implements Externalizable {

	String s;
	int i;
	int j;

	public ExternalizableDemo()
	{
		System.out.println("public no aguement constructor");
	}
	public ExternalizableDemo(String s,int i,int j)
	{
		this.s=s;
		this.i=i;
		this.j=j;
	}
	// WRITE EXTERNAL METHOD CODE
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeObject(s);
		out.writeInt(i);
		//out.writeObject(i);
	}
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
	{
		s=(String)in.readObject() ;
		i=in.readInt();
	}



	public static void main(String[] args) throws Exception {
		ExternalizableDemo e1=new ExternalizableDemo("Neha",10,20);
		FileOutputStream fos=new FileOutputStream("seriazablefile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		 oos.close();
		
		  FileInputStream fis=new FileInputStream("seriazablefile.txt"); 
		  ObjectInputStream ois=new ObjectInputStream(fis); 
		   ExternalizableDemo  e2=(ExternalizableDemo)ois.readObject(); 
		  System.out.println(e2.s+".."+e2.j);  
		   ois.close();
		 	}

	
}

