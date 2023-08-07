import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeOf {

	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 513);
		LocalDateTime ldt2 = LocalDateTime.of(2019, Month.JANUARY, 10, 10, 20, 30);
		LocalDateTime ldt3 = LocalDateTime.of(2019, 1, 40, 10, 20, 30);
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println(ldt3);
		
		LocalDate ld = LocalDate.of(2019, 1, 10);
		LocalTime lt = LocalTime.of(10, 20, 30);
		LocalDateTime ldt4 = LocalDateTime.of(ld, lt);
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt4);

	}

}
