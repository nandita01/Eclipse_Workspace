package thisSuperTest;
class Pro
{
	int a=10;
	int b=20;
}
public class superDemo extends Pro
{
int x=100;
int y=200;
void add (int i,int j)
{
	System.out.println("Addition is "+(a+b));
	System.out.println("Addition is "+(x+y));
	System.out.println("Addition is "+(i+j));
}
public static void main(String[] args)
{
	superDemo s = new superDemo();
	s.add(1000,2000);
}
}

