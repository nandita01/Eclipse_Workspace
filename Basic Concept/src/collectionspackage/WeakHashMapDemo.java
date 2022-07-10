package collectionspackage;
import java.util.*;
import java.util.HashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws Exception {
		WeakHashMap h= new WeakHashMap();
		Temp t=new Temp();
		h.put(t,"Nandita");
		System.out.println(h);
		t=null;
		System.gc();
		//Thread.sleep(1000);
		System.out.println(h);
	}
}
class Temp{
	public String toString() {
		return "temp";
			}
	public void finalize() {
		System.out.println("finilize method called");
	}
	
}