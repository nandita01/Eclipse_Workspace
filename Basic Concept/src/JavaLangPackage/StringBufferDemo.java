package JavaLangPackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*/StringBuffer sb=new StringBuffer();
		sb.append("abcdefghijklmnop");
		sb.append("q");
		System.out.println(sb.capacity());*/
		/*StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.capacity());*/
		/*StringBuffer sb=new StringBuffer();
		sb.append("PI value is:");
		sb.append(3.14);
		sb.append("It is exactly");
		sb.append("true");
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer("abcdefgh");
		sb.insert(2, "xyz");
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer("abcdefgh");
		sb.delete(2,5);
		sb.deleteCharAt(4);
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.reverse());*/
		/*StringBuffer sb=new StringBuffer("NanditaRathore");
		sb.setLength(7);
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());*/
		StringBuffer sb=new StringBuffer(1000);
		sb.append("abc");
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		
		
		
		

	}

}
