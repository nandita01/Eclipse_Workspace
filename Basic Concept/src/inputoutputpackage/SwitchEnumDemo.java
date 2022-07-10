package inputoutputpackage;

public class SwitchEnumDemo {
	enum alphabet
	{
		A,B,C,D,E;
	}
	
	public static void main(String[] args) {
		alphabet a=alphabet.D;
		switch(a)
		{
		case A:System.out.println("A for Apple");
		break;
		case B:System.out.println("B for Boy");
		break;
		case C:System.out.println("C for Cat");
		break;
		case D:System.out.println(" D for Dog");
		break;
		case E:System.out.println("E for Elephant");
		break;
		default:System.out.println("No such alphabat found");
		}
	}
}
		
		

	
