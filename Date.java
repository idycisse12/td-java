import java.text.SimpleDateFormat;
import java.util.calendar;
import java.util.GregorianCalendar;
public class Date{
    public static void main(String[] args){
        calendar calendar =  calendar.getInstance(); 
        calendar calendar2 = new GregorianCalendar();
        calendar2.set(2019, 6, 24);
        System.out.println(calandar2.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat ("EEE dd/MM/YYYY");
        System.out.println(sdf.format(calendar2.getTime()));
    }
}
