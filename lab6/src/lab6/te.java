package lab6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDate1="31/12/1998";
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    LocalDate date = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	    System.out.println(date);
	}

}
