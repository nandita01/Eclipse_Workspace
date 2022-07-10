package JavaLangPackage;

public class FinalizeMethodDemo {
	public static void main(String[] args) {
		TempFinalize t=new TempFinalize();
		System.out.println(t);
		t=null;
		System.gc();
		System.out.println(t);
		//System.gc();
	}

}
	