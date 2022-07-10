package EightFeatures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstructorLambdaDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
		System.out.println(setFunction.apply(fruits));
		
		//USING  METHOD REFERENCE
		Function<List<String>, Set<String>> setConstructorLambdaDemo = HashSet::new;
		System.out.println(setConstructorLambdaDemo.apply(fruits));
	}

}
