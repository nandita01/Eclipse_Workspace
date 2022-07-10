package EightFeatures;

interface Printable
{
	void print(String msg);
}

public class InstanceParticularDemo {
	public void display(String msg)
	{
		msg=msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		InstanceParticularDemo instanceParticularDemo=new InstanceParticularDemo();
		// $$$$$$$$$ METHOD REFERENCE TO AN INSTANCE METHOD OF AN OBJECT
		Printable printable=(msg)->instanceParticularDemo.display(msg);
		printable.print("hello world");
	}

}
