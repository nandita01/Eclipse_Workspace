package com.pp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestProgam {
	public static void main(String[] args) {
		String str= "i am a java developer";
		System.out.println(find(str));
	}
	
	public static char find(String str) {
		
		Map<Character ,Integer>  map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char key = str.charAt(i);
			if(map.containsKey(key)) {
				map.put(key,map.get(key)+1);
			}else {
				map.put(key, 1); 
			}
		}
		System.out.println(map);
		
		return ' '; 
	}
}
// String str= "i am a java developer"
//method(str) 


// a=1 b=2 c=54 d=4