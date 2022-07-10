package EightFeatures;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceStaticDemo {
	public static int addition(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		//@@@@@@@@@@  LAMBDA EXPRESSION
//		Function<Integer,Double>function=(input) -> Math.sqrt(input);
//		System.out.println(function.apply(4));
		
		
		//########### USING METHOD REFERENCE TO A STATIC METHOD
		Function<Integer,Double>functioMethodRef=Math::sqrt;
		System.out.println(functioMethodRef.apply(4));

		//@@@@@@@@@@ LAMBDA EXPRESSION
//		BiFunction<Integer, Integer,Integer>biFunctionLambda=(a,b)-> MethodReferenceStaticDemo.addition(a,b);
//		System.out.println(biFunctionLambda.apply(30, 20));
		
		//########### USING METHOD REFERENCE TO A STATIC METHOD
		BiFunction<Integer, Integer,Integer>biFunction=MethodReferenceStaticDemo::addition;
		System.out.println(biFunction.apply(100, 20));
	}

}
