package etc.ESTsoft;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Number3 {

    public String solution(String noti_time, String[] do_not_disturb) throws ParseException {
        for (String s : do_not_disturb) {
            noti_time = checkNotificationTime(noti_time, s);
        }

        String temp = noti_time;
        noti_time = checkNotificationTime(noti_time, do_not_disturb[0]);
        if (!temp.equals(noti_time)) {
            return "impossible";
        }

        return noti_time;
    }

    private String checkNotificationTime(final String noti_time, final String not) throws ParseException {
        final String[] timeRange = not.split("~");
        final String startTime = timeRange[0];
        final String endTime = timeRange[1];

        final DateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date notificationTime = timeFormat.parse(noti_time);
        Date startTimeRange = timeFormat.parse(startTime);
        Date endTimeRange = timeFormat.parse(endTime);

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        Calendar notification = Calendar.getInstance();
        start.setTime(startTimeRange);
        end.setTime(endTimeRange);
        notification.setTime(notificationTime);

        if (end.before(start)) {
            end.add(Calendar.DATE, 1);
            endTimeRange = end.getTime();
            if (notificationTime.before(startTimeRange)) {
                notification.add(Calendar.DATE, 1);
                notificationTime = notification.getTime();
            }
        }

        if ((notificationTime.after(startTimeRange) && notificationTime.before(endTimeRange))
            || notificationTime.equals(startTimeRange) || notificationTime.equals(endTimeRange)) {
            return endTime;
        }
        return noti_time;
    }

}
