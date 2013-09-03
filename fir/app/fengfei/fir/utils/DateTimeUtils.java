package fengfei.fir.utils;

public class DateTimeUtils {

    final static int OneMinute = 60;
    final static int OneHour = OneMinute * 60;
    final static int OneDay = OneHour * 24;
    final static int OneMonth = OneDay * 30;
    final static int OneYear = OneDay * 365;

    /**
     * m years n months/x minutes/m hours/m days
     * 
     * @param before
     * @return
     */
    public static String period(long before) {
        int seconds = (int) ((System.currentTimeMillis() - before) / 1000);
        int minutes = seconds / OneMinute;
        int hours = seconds / OneHour;
        int days = seconds / OneDay;
        int months = seconds / OneMonth;
        int years = seconds / OneYear;
        int ymonths = (seconds % OneYear) / OneMonth;
        String lostTime = null;
        if (minutes >= 1) {
            lostTime = minutes + " minutes";
        } else {
            lostTime = "1 minutes";
        }
        if (hours >= 1) {
            lostTime = hours + " hours";
        }
        if (days >= 1) {
            lostTime = days + " days";
        }
        if (months >= 1) {
            lostTime = months + " months";
        }
        if (years >= 1) {
            lostTime = years + " years";
            if (ymonths >= 1) {
                lostTime += " " + ymonths + " months";
            }
        }
        return lostTime;
    }
}
