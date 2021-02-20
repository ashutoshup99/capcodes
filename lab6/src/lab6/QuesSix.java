package lab6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
public class QuesSix {
	public static void main(String[] args) {
		HashMap<Integer, String> mapVoters = new HashMap<>();
		mapVoters.put(1,"26/07/1989");
		mapVoters.put(2,"20/03/1980");
		mapVoters.put(3,"06/07/1999");
		mapVoters.put(4,"02/04/2014");
		mapVoters.put(5,"08/07/2009");
		List<Integer> l=new ArrayList<>();
		l=votersList(mapVoters);
		System.out.println(l);
}

	private static List<Integer> votersList(HashMap<Integer, String> mapVoters) {
		LocalDate today = LocalDate.now();
		List<Integer> l1=new ArrayList<>();
		Map<Integer, String> resultMap = new HashMap<>();
		for(Map.Entry<Integer,String> i: mapVoters.entrySet()){
		    Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(i.getValue());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		    LocalDate date = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			Period p = Period.between(date, today);
			if(p.getYears()>=18) {
				l1.add(i.getKey());
			}
		}
		return l1;
	}
}
