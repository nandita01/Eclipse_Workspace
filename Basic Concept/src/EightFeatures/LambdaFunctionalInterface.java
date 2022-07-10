package EightFeatures;
interface Show
{
	void draw();
}
class Polygon implements Show
{
	public void draw()
	{
		System.out.println("Shape Polygon method");
	}
}

public class LambdaFunctionalInterface {

	public static void main(String[] args) {
		Show polygon= ()-> System.out.println("Shape Polygon method by LambdaExpression");
		polygon.draw();
		
		//**** WE USE THIS CODE ALSO IF WE HAVE MULTIPLE EXPRESSION
//		Show polygon= ()-> 
//		{
//			System.out.println("Shape Polygon method by LambdaExpression");
//		};
//		polygon.draw();
	}

}
