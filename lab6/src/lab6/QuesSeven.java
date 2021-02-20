package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuesSeven {
	public static void main(String[] args) {
	Integer arr[]= {112,25,345,324,754};
	List<Integer> res=getSorted(arr);
	System.out.println(res);
}

	private static List<Integer> getSorted(Integer[] arr) {
		List<Integer> list=Arrays.asList(arr);
		Collections.reverse(list); 
        Collections.sort(list);
		return list;
	}
}
