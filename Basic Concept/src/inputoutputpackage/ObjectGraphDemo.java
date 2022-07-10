package inputoutputpackage;
import java.io.*;
class Graph1 implements Serializable
{
	Graph2  g2=new Graph2();
}
class Graph2 implements Serializable
{
	Graph3 g3=new Graph3();
}
class Graph3 implements Serializable
{
	int j=20;
}

public class ObjectGraphDemo {

	public static void main(String[] args) throws Exception {
		Graph1 g1=new Graph1();
		FileOutputStream fos=new FileOutputStream("serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g1);

		FileInputStream fis=new FileInputStream("serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Graph1 g=(Graph1)ois.readObject();
		System.out.println(g.g2.g3.j);




	}

}
