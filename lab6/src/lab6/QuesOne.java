package lab6;
import java.util.*; 
import java.lang.*;
public class QuesOne {
	public static void main(String[] args) 
    {
	HashMap<String,Integer> l=new HashMap<>();
	l.put("Math",89);
	l.put("Physics",79);
	l.put("Chemistry",99);
	l.put("English",80);
	l.put("Hindi",85);
    Map<String, Integer> l1 = sortByValue(l); 
    for (Map.Entry<String, Integer> en : l1.entrySet()) { 
        System.out.println("Key = " + en.getKey() +  
                      ", Value = " + en.getValue()); 
    } 
	
}
	private static Map<String, Integer> sortByValue(HashMap<String, Integer> l) {
		List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(l.entrySet()); 	
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
	}
}
