import java.util.Calendar;

public class Time {
	Calendar time;

	String getTime() {
		time = Calendar.getInstance();
		String whatTime = time.getTime().toString();
		return whatTime;
	}
}
