import java.util.Comparator;
import java.util.TreeSet;

public class ReviseTree {

	public static void main(String[] args) {
		TreeSet t = new TreeSet( new MyComparator());
		t.add("Nandita");
		t.add("Karan");
		t.add("Adwik");
		t.add("Jaha");
		t.add("Pravin");
		System.out.println(t);
		}}
	class MyComparator implements Comparator{
		public int compare(Object obj1, Object obj2)
		{
			String i1 = (String)obj1;
			String i2= (String)obj2;
			return i2.compareTo(i1);
		}
	}


