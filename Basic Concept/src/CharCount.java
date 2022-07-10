import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {

		String str = "aaaeeeeeeeeeeeeeeeebbccdaeeefff"; //a3 b2 c2 e3 d1 f3


		Map<Character , Integer> map = new HashMap<>();

		for(int i=0; i<str.length();i++) {
			char key = str.charAt(i) ;

			if(!map.containsKey(key)) {
				map.put(key, 1); // a 1 b 			
			}else {
				map.put(key, map.get(key)+1); //a 3
			}
		}
		System.out.println(map);
		System.out.println(str.length());
	}
}