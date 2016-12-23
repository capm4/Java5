package Module3.Practick.DateFormat;


import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class SimpleDateFormat {


    public static void main(String[] args) {
        DayOf();
    }

    public static void LocalD(){
        int mm = 05;
        int dd = 02;
        int yy = 1990;
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek() +" "+ dt.getEra());
    }

    public static void DayOf(){
        String month = "04";
        String day = "16";
        String year = "2000";

        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        String weekdays[] = dfs.getWeekdays();

        Calendar cal = new GregorianCalendar(Locale.US);

        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }



}
