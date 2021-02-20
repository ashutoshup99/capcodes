package lab8;
import java.io.*; 
import java.util.*; 

public class CopyDataThread extends Thread {
	FileInputStream instream;
	FileOutputStream outstream;
 
	public CopyDataThread(FileInputStream instream, FileOutputStream outstream) {
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