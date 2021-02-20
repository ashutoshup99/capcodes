package pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeSequence implements Sequence {

	@Override
	public List<Integer> next(String s, int n) {
		List<Integer> l=new ArrayList<>();
		int i =0;
	    int num =0;
		for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    l.add(i);
		 }	
	      }	
		return l;
	}

}
