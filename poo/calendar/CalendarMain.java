package poo.calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain {
    
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2022-06-25T21:15:30Z"));

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(d);
        calendario.add(Calendar.HOUR_OF_DAY, 4); 
        d = calendario.getTime(); 

        int minutes = calendario.get(Calendar.MINUTE);
        int month = 1 + calendario.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
