package lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {
	public static void main(String args[]) throws FileNotFoundException {
		File infile =new File("C:\\Users\\HP\\Desktop\\cap\\input.txt");
	    File outfile =new File("C:\\Users\\HP\\Desktop\\cap\\output.txt");
	    FileInputStream instream;
		FileOutputStream outstream;
	    instream = new FileInputStream(infile);
	    outstream = new FileOutputStream(outfile);
		CopyDataThread c=new CopyDataThread(instream,outstream);
		c.run();
		System.out.println("Completed");
	}
}
