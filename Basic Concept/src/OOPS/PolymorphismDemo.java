package OOPS;
class Animal
{
	public void sound()
	{
		System.out.println("Animal sounds very loudly");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog sounds bow bow");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("cat sound meeh meeh");
	}
}

	public class PolymorphismDemo {

		public static void main(String[] args) {
      		Animal a=new Animal();
		    Dog d=new Dog();
			Cat c=new Cat();
			a.sound();
			d.sound();
			c.sound();

		}

	}
