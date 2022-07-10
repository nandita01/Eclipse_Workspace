package EightFeatures;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
//String email=null;
		String email="neha99@gmailcom";
		
		//of, empty, ofNullable
//		Optional<Object> emptyOptional= Optional.empty();
//		System.out.println( emptyOptional);
//		
//		Optional<String> emptyOptional1 = Optional.of(email);
//		System.out.println( emptyOptional1);
		
		Optional<String> StringOptional = Optional.ofNullable(email);
//	System.out.println( StringOptional);
//System.out.println( StringOptional.get());
		
		if(StringOptional.isPresent())
			System.out.println(StringOptional.get());
		else
			System.out.println("No value prsent");
		
		
		Optional<String> StringOptional1= Optional.ofNullable(email);
		String defaultOptional=StringOptional1.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		
		String defaultOptional1=StringOptional.orElseGet(()->"already@gmail.com");
		System.out.println(defaultOptional1);
		
		String optionalObject= StringOptional.orElseThrow(()-> new IllegalArgumentException("Email is not exist"));
		System.out.println(optionalObject);
		//map(), filter()
	}
	

}
