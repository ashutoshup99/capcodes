package lab3;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
public class QuesSeven {

	   public static void main(String[] args) {
		   	LocalDateTime timePoint = LocalDateTime.now(); // The current date and time
			System.out.println(timePoint);
			LocalDate localDate = LocalDate.of(2012, Month.DECEMBER, 12); 
			System.out.println(localDate);
			LocalDate theDate = timePoint.toLocalDate();
			Month month = timePoint.getMonth();
			int day = timePoint.getDayOfMonth();
			timePoint.getSecond();

			System.out.println(theDate + " Month: " + month + " Day : " + day + " seconds: " + timePoint.getSecond());

	   }
	}

