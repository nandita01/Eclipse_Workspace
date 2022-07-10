package EightFeatures;
interface Shape
{
	void draw();
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Rectangle: draw Method");
	}
}
class Square implements Shape
{
	public void draw()
	{
		System.out.println("Square: draw Method");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Circle: draw Method");
	}
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		Shape rectangle =() -> System.out.println("Rectangle: draw Method Lambda Expressions");
		//rectangle.draw();
		
		Shape square =() -> System.out.println("Square: draw Method Lambda Expressions");
		//square.draw();
		
		Shape circle =() -> System.out.println("Circle: draw Method Lambda Expressions");
		//circle.draw();
		
		//print(rectangle);
		print(()-> System.out.println ("Rectangle: draw Method Lambda Expressions"));
		
		
		print(square);
		print(circle);
	}

// PASSING LAMBDA EXPRESSION TO A METHOD
private static void print(Shape shape)
{
	shape.draw();
	}
}
