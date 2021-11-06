package DateAndTimeRepresentationDemo;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarDemo {

	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.getWeeksInWeekYear());
		System.out.println(gc.getCalendarType());
		
		
		TimeZone tz=gc.getTimeZone();
		System.out.println(tz.getID());
		System.out.println(tz.getTimeZone("America/Los-Angeles"));
		
		gc.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
		System.out.println(gc);
	}
}
