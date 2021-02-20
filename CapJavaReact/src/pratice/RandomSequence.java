package pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSequence implements Sequence {

	@Override
	public List<Integer> next(String s, int n) {
        Random rand = new Random(); 
		List<Integer> l=new ArrayList<>();   
        for(int i=0;i<n;i++) {
		int num = rand.nextInt(1000);
		l.add(num);
        }
		return l;
		
	}	

}
