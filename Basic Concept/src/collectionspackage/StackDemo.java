package collectionspackage;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push(10);
		s.push("C");
		s.push(null);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search(10));
		System.out.println(s.search(11));
	}

}
