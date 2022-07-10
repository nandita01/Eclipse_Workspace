package generics;
class Gen<T>
{
	T obj;
	Gen(T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println("The type of object:"+obj.getClass().getName());
	}
	public T getobj()
	{
		return obj;
	}
	}

public class GenericsDemo {
	public static void main(String[] args) {
		Gen<String> g1=new Gen<String>("Nandita");
		g1.show();
		System.out.println(g1.getobj());
		Gen<Integer>g2=new Gen<Integer>(10);
		g1.show();
		System.out.println(g2.getobj());

	}

}
