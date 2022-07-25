package collectionspackage;

import java.util.Stack;

public class StackMethods {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push("Nandita");
	s.push("Karan");
	s.push("Vandita");
	s.push("Adwik");
	s.push("Kashish");
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.empty());
	System.out.println(s.search("Jaya"));
}
}
