package EightFeatures;

import java.util.function.Function;

public class InstanceOrbitaryDemo {

	public static void main(String[] args) {
		Function<String,String> stringFunction=(String input)->input.toLowerCase();
		System.out.println(stringFunction.apply("NANDITA RATHORE"));
		System.out.println(stringFunction.apply("JAVA DEVELOPER"));

		Function<String,String> stringInstanceOrbitaryDemo=String::toLowerCase;
		System.out.println(stringInstanceOrbitaryDemo.apply("CHHOTI KASRAWAD"));
	}

}
