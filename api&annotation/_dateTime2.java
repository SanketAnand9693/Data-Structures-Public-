import java.time.*;
public class _dateTime2
{
    public static void main(String[] args) {
        LocalDate d1=LocalDate.now();//For getting date in year-month-day format
        // System.out.println(d1); 
        int Day=d1.getDayOfMonth();
        // System.out.println(Day);
        int month=d1.getMonthValue();
        int year=d1.getYear();
        System.out.println(Day+"/"+month+"/"+year);


        LocalTime t1=LocalTime.now();
        int hour=t1.getHour();
        int min=t1.getMinute();
        int sec=t1.getSecond();
        int nano=t1.getNano();
        System.out.println(hour+":"+min+":"+sec+":"+nano);
    }
}