package EightFeatures;
//****** TRADITIONAL WAY
interface addition
{
	int add(int a,int b);
}
class Other implements addition
{
	public int add(int a,int b)
	{
	return(a+b);
	}
}
public class LambdaParameterDemo {

	public static void main(String[] args) {
	addition  add=(a,b)->(a+b);
	int result=add.add(10,20);
	System.out.println("Addition is:"+result);
//		addition abc=(int a,int b)->
//		{
//		int c=(a+b);
//		return c;
//		};
		

}
}
