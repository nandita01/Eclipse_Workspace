

	

	// Java program for the above approach
	public class Task  {
	    static final int MAX_CHAR = 256;
	 
	    static void getOccuringChar(String str)
	    {
	         
	        // Create an array of size 256
	        // i.e. ASCII_SIZE
	        int count[] = new int[MAX_CHAR];
	 
	        int len = str.length();
	 
	        // Initialize count array index
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	 
	        // Create an array of given String size
	        char ch[] = new char[str.length()];
	        for (int i = 0; i < len; i++) {
	            ch[i] = str.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (str.charAt(i) == ch[j])
	                    find++;
	            }
	 
	            if (find == 1)
	                System.out.println(
	                    "Number of Occurrence of "
	                    + str.charAt(i)
	                    + " is:" + count[str.charAt(i)]);
	        }
	    }
	   
	    // Driver Code
	    public static void main(String[] args)
	    {
	        String str = "aaabbccccde";
	        getOccuringChar(str);
	    }
	}

	
	
	
	
	
	
	
	
	
	

	     
//public static void main(String[] args) {
//	String someString = "elephant";
//	char someChar = 'e';
//	int count = 0;
//	for (int i = 0; i < someString. length(); i++)
//	{ 
//		if (someString. charAt(i) == someChar)
//	{ 
//			count++;
//	}
//	}
//	assertEquals(2, count);
//}