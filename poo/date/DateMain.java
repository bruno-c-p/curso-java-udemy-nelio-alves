package poo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

import utils.Messages;

public class DateMain {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        Date y1 = sdf.parse("25/06/2022");
        Date y2 = sdf2.parse("25/06/2022 21:15:30");
        Date y3 = Date.from(Instant.parse("2022-06-25T21:15:30Z"));

        Messages.showMSG(sdf2.format(x1));
        Messages.showMSG(sdf2.format(x2));
        Messages.showMSG(sdf2.format(x3));
        Messages.showMSG(sdf2.format(x4));

        Messages.showMSG(sdf.format(y1));
        Messages.showMSG(sdf2.format(y2));
        Messages.showMSG(sdf3.format(y3));
    }
}
