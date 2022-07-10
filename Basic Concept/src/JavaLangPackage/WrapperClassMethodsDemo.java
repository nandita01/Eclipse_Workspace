package JavaLangPackage;

public class WrapperClassMethodsDemo {
	// FIRST FORM
	public static void main(String[] args) {
		/*Integer I=Integer.valueOf("10");
		Boolean B1=Boolean.valueOf("true");
		Boolean B2=Boolean.valueOf(false);
		System.out.println(I);
		System.out.println(B1);
		System.out.println(B2);*/
		// SECOND FORM
		/*Integer I1=Integer.valueOf("100",5);
		System.out.println(I1);
		Integer I2=Integer.valueOf("100",36);
		System.out.println(I2);*/
		
		/*Integer a=new Integer(130);
		System.out.println(a.byteValue());
		System.out.println(a.shortValue());
		System.out.println(a.intValue());
		System.out.println(a.longValue());
		System.out.println(a.floatValue());
		System.out.println(a.doubleValue());
		
		Character ch=new Character('a');
		char c=ch.charValue();
		System.out.println(c);
		
		Boolean B= Boolean.valueOf("Neha");
		boolean b=B.booleanValue();
		System.out.println(b);*/
		
		//PARSEXxx()
		int i=Integer.parseInt("10");
		double d=Double.parseDouble("10.5");
		boolean b= Boolean.parseBoolean("true");
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}
	}
