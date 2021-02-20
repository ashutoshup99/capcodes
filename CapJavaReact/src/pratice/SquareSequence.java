package pratice;

import java.util.ArrayList;
import java.util.List;

public class SquareSequence implements Sequence {
	@Override
	public List<Integer> next(String s, int n) {
		 List<Integer> l=new ArrayList<>();   
		 for (int i = 0; i < n; i++) 
		    { 
		    	l.add((int) Math.pow(i, 2));
		    }
		return l;
	}

}
