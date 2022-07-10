package inputoutputpackage;
import java.io.*;
public class TaskIO {
	public static void main(String[] args)  throws IOException{
			File file = new File("Check.txt"); 
		    String[] words = null;  
		  
		    FileReader fr = new FileReader(file);
		    BufferedReader br = new BufferedReader(fr);  
		    String str;     
		    String search = "Karan";   
		    int count = 0;    
		    while((str = br.readLine()) != null)  
		    {
		      words = str.split(" ");  
		      for (String word : words) 
		      {
		        if (word.equals(search))   
		        {
		          count++;    
		        }
		      }
		    }
		    if(count!=0) 
		    {
		      System.out.println("The word is present "+ count + " times in the file");
		    }
		    else
		    {
		      System.out.println("The word doesn't exist in the file!");
		    } 
		    fr.close();
		   }
		}

//int count=0;
//
//FileWriter fw=new FileWriter("Check.txt");
//fw.write("Karan");
//fw.write("\n");
//fw.write("Rohit");
//fw.write("\n");
//fw.write("Vinod");
//fw.write("\n");
//fw.write("Nandita");
//fw.write("\n");
//fw.write("Karan");
//fw.write("\n");
//char[] ch= {'x','y','z'};
//fw.write(ch);
// for  (int i=0; i<string.length; i++) {
//     count++;
//  }
//  System.out.println("Number of characters in the given file are " +count);
////System.out.println(fw);
//fw.flush();
//fw.close();

