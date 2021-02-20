package pratice;
import java.io.*; 
public class file 
	{ 
	  public static void main(String[] args) throws Exception 
	  { 
	    // pass the path to the file as a parameter 
	    FileReader fr = 
	      new FileReader("C:\\Users\\HP\\Desktop\\cap\\input.txt"); 
	  
	    int i; 
	    while ((i=fr.read()) != -1) 
	      System.out.print((char) i); 
	  } }

	

