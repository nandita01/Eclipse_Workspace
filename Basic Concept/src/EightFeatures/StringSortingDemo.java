package EightFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortingDemo {

	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("A");
		l.add("AAAA");
		l.add("AA");
		l.add("AAAAA");
		l.add("AAA");	
//		l.add("so");
//		l.add("Kat");
//		l.add("Pari");
//		l.add("Adwik");
//		l.add("Monali");
		System.out.println(l);
		Comparator<String>c= (s1,s2)->
		{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
			
		};
		List<String>sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
