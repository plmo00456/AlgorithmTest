import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws IOException {
    	Calendar calendar = Calendar.getInstance();
    	Date date = calendar.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(sdf.format(date));
    }
}
