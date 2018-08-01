import java.util.Calendar;

public class Main {
	public static void main(String args[]) {
		Employee.builder()
				.id(1)
				.name("Tekle")
				.hireDate(Calendar.getInstance().getTime())
				.fullTime(true)
				.build();
	}
}
