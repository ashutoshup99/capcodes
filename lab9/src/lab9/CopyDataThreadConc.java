package lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyDataThreadConc implements Runnable {
	FileInputStream instream;
	FileOutputStream outstream;
 
	public CopyDataThreadConc(FileInputStream instream, FileOutputStream outstream) {
		super();
		this.instream = instream;
		this.outstream = outstream;
	}
	
	
	@Override
	public void run(){
		try{
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 
    	}
	}
}
