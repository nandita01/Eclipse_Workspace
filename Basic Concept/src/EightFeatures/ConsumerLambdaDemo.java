package EightFeatures;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>
{
	public void accept(String input)
	{
		System.out.println(input);
	}
}

public class ConsumerLambdaDemo {

	public static void main(String[] args) {
//		Consumer<String>consumer=new ConsumerImpl();
//		consumer.accept("Nandita Rathore");
		
		//*****LAMBDA EXPRESSION
		Consumer<String>consumer=(input)->System.out.println(input);
		consumer.accept("Nandita Rathore");
			
		

	}

}
