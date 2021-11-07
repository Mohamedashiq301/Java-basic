package DateAndTimeRepresentationDemo;

import java.time.Instant;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		MonthDay md=MonthDay.now();
		System.out.println(md);
		
		Period p=Period.of(2, 2, 10);
		System.out.println(p.addTo(zdt));
		
		Instant i=Instant.now();
		System.out.println(i);
	}
}
