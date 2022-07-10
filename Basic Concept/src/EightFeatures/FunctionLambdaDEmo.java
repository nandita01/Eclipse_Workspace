package EightFeatures;

import java.util.function.Function;

class FunDemo implements Function<String,Integer>
{
	public Integer apply(String s)
	{
		return s.length();
	}
}

public class FunctionLambdaDEmo {

	public static void main(String[] args) {
//		Function<String,Integer> function=new FunDemo();
//		System.out.println(function.apply("Nandita"));

		//USING LAMBDAEXPRESSION
		Function<String,Integer> function= (String s)->s.length();
		
			System.out.println(function.apply("Nandita"));
		
	}

}
