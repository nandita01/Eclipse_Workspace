package EightFeatures;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime>
{
	public LocalDateTime get()
	{
		return LocalDateTime.now();
	}
}

public class SupplierLambdaDemo {

	public static void main(String[] args) {
		//		Supplier supply=new SupplierImpl();
		//		System.out.println(supply.get());

		// USING LAMBDA EXPRESSION		

		Supplier supply=()->LocalDateTime.now();
		System.out.println(supply.get());


	}
}
