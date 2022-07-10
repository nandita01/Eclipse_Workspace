package JavaLangPackage;

public class StringDemo {
	public static void main(String[] args) {
		// IMMUTABLE DEMO
		/*String s= new String("prestige");
		s.concat("point");
		System.out.println(s);*/
		//
		//STRINGBUFFER DDEMO
		/*StringBuffer sb=new StringBuffer("prestige");
		sb.append("point");
		System.out.println(sb);*/
		
		//.EQUALS METHOD DEMO
		/*String s1=new String("Nandita");
		String s2=new String("Nandita");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		// .EQUALS METHOD DEMO IN STRINGBUFFER
		/*StringBuffer sb1=new StringBuffer("Rathore");
		StringBuffer sb2=new StringBuffer("Rathore");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));*/
		
		// STRING CLASS METHOD
		char c[]= {'J','a','v','a'};
		String s1=new String(c);
		String s2=new String(s1);
		System.out.println(s1);
		System.out.println(s2);
		
		/*String s1=new String("durga");
		s1.concat("software");
		String s2=s1.concat("solutions");
		s1=s1.concat("soft");
		System.out.println(s1);
		System.out.println(s2);*/

	}
	

}
