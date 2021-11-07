package DateAndTimeRepresentationDemo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class JodaCalendarDemo {

	public static void main(String[] args) {
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1=LocalDate.of(2019, 12, 29);
		System.out.println(ld1);
		
		LocalDate ld2=LocalDate.ofEpochDay(3);
		System.out.println(ld2);
		//It will calculate date from starting of date package
		
		LocalDate ld3=LocalDate.now(Clock.systemDefaultZone());
		System.out.println(ld3);
		
		LocalDate ld4=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(ld4);
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		LocalTime lt1=lt.minusHours(3);
		System.out.println(lt1);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getYear());
	}
}
