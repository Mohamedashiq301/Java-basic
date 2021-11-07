package DateAndTimeRepresentationDemo;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime ldt5=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(df.format(ldt5));
		
		System.out.println(ldt5.get(ChronoField.YEAR));
	}
}
