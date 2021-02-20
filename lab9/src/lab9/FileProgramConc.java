package lab9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgramConc {

public static void main(String[] args) throws FileNotFoundException {
		
		File infile =new File("C:\\Users\\HP\\Desktop\\cap\\inp.txt");
	    File outfile =new File("C:\\Users\\HP\\Desktop\\cap\\outp.txt");
	    FileInputStream instream;
		FileOutputStream outstream;
	    instream = new FileInputStream(infile);
	    outstream = new FileOutputStream(outfile);
	    CopyDataThreadConc c=new CopyDataThreadConc(instream,outstream);
		ExecutorService service = Executors.newFixedThreadPool(2);
		Runnable runnable = new CopyDataThreadConc(instream,outstream);;
		service.submit(runnable);

	}

}
