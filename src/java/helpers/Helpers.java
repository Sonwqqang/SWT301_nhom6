package helpers;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Helpers {

    public static int parseInt(String x, int value) {
        try {

            value = Integer.parseInt(x);

        } catch (NumberFormatException e) {
            System.out.println("Helpers -> parseInt():\n" + e);
        }
        return value;
    }

    public static double parseDouble(String x, double value) {
        try {

            value = Integer.parseInt(x);

        } catch (NumberFormatException e) {
            System.out.println("Helpers -> parseDouble():\n" + e);
        }
        return value;
    }

    public static float parseFloat(String x, float value) {
        try {

            value = Integer.parseInt(x);

        } catch (NumberFormatException e) {
            System.out.println("Helpers -> parseFloat():\n" + e);
        }
        return value;
    }

    public static Date parseDateUtil(String date, String pattern) {
        // pattern here is format, like: dd/MM/yyyy
        Date parsed = new Date();
        try {
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            parsed = format.parse(date);
        } catch (ParseException e) {
            System.out.println("Helpers -> parseDateUtil():\n" + e);
        }
        return parsed;
    }

    public static java.sql.Date parseDateSql(String date, String pattern) {
        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            return java.sql.Date.valueOf(parsedDate);
        } catch (Exception e) {
            System.out.println("Helpers -> parseDateSql():\n" + e);
        }
        return getCurrentSqlDate();
    }

    public static java.sql.Date getCurrentSqlDate() {
        LocalDate curDate = java.time.LocalDate.now();
        return java.sql.Date.valueOf(curDate.toString());
    }

    public static Date getCurrentUtilDate() {
        return new Date();
    }

    public static String convertBooleanToString(boolean bool, String isTrue, String isFalse) {
        return (bool ? isTrue : isFalse);
    }

    public static String convertIntToString(int bool, String isTrue, String isFalse) {
        return (bool == 1 ? isTrue : bool == 0 ? isFalse : "");
    }

    public static boolean isStartWiths(String current, String startsWith) {
        return current.startsWith(startsWith);
    }

    public static boolean isEndWiths(String current, String endsWith) {
        return current.endsWith(endsWith);
    }

    public static boolean isBelong(String current, int max) {
        return current.length() <= max;
    }

    public static boolean isBetween(String current, int start, int end) {
        return current.length() >= start && current.length() <= end;
    }

    public static long convertDateToAge(Date date) {
        Date currentDate = new Date();
        long currentTimestamp = currentDate.getTime(); // timestamp is date but miliseconds
        long dateTimestamp = date.getTime();

        long distance = currentTimestamp - dateTimestamp;
        System.out.println("distance: " + distance);
        long age = distance / 1000 / 60 / 60 / 24 / 365;
        /**
         * Seconds: distance / 1000 Minutes: distance / 1000 / 60 Hours:
         * distance / 1000 / 60 / 60 Days: distance / 1000 / 60 / 60 / 24 Years:
         * distance / 1000 / 60 / 60 / 24 / 365
         */
        return age;
    }

    public int parseIntJSP(String x, int value) {
        try {

            value = Integer.parseInt(x);

        } catch (NumberFormatException e) {
            System.out.println("Helpers -> parseInt():\n" + e);
        }
        return value;
    }

    public double parseDoubleJSP(String x, double value) {
        try {

            value = Integer.parseInt(x);

        } catch (NumberFormatException e) {
            System.out.println("Helpers -> parseDouble():\n" + e);
        }
        return value;
    }

    public float parseFloatJSP(String x, float value) {
        try {

            value = Integer.parseInt(x);

        } catch (NumberFormatException e) {
            System.out.println("Helpers -> parseFloat():\n" + e);
        }
        return value;
    }

    public Date parseDateUtilJSP(String date, String pattern) {
        // pattern here is format, like: dd/MM/yyyy
        Date parsed = new Date();
        try {
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            parsed = format.parse(date);
        } catch (ParseException e) {
            System.out.println("Helpers -> parseDateUtil():\n" + e);
        }
        return parsed;
    }

    public java.sql.Date parseDateSqlJSP(String date, String pattern) {
        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            return java.sql.Date.valueOf(parsedDate);
        } catch (Exception e) {
            System.out.println("Helpers -> parseDateSql():\n" + e);
        }
        return getCurrentSqlDate();
    }

    public java.sql.Date getCurrentSqlDateJSP() {
        LocalDate curDate = java.time.LocalDate.now();
        return java.sql.Date.valueOf(curDate.toString());
    }

    public Date getCurrentUtilDateJSP() {
        return new Date();
    }

    public String convertBooleanToStringJSP(boolean bool, String isTrue, String isFalse) {
        return (bool ? isTrue : isFalse);
    }

    public String convertIntToStringJSP(int bool, String isTrue, String isFalse) {
        return (bool == 1 ? isTrue : bool == 0 ? isFalse : "");
    }

    public String convertBooleanToImageJSP(boolean bool, String isTrueURL, String isFalseURL) {
        String isTrue = "";
        String isFalse = "";
        if(!isTrueURL.isEmpty()) {
            isTrue =  "<img src='" + isTrueURL + "' />";
        }
        if(!isFalseURL.isEmpty()){
            isFalse = "<img src='" + isFalseURL + "' />";
        }
        return (bool ? isTrue : isFalse);
    }

    public boolean isStartWithsJSP(String current, String startsWith) {
        return current.startsWith(startsWith);
    }

    public boolean isEndWithsJSP(String current, String endsWith) {
        return current.endsWith(endsWith);
    }

    public boolean isBelongJSP(String current, int max) {
        return current.length() <= max;
    }

    public boolean isBetweenJSP(String current, int start, int end) {
        return current.length() >= start && current.length() <= end;
    }

    public long convertDateToAgeJSP(Date date) {
        Date currentDate = new Date();
        long currentTimestamp = currentDate.getTime(); // timestamp is date but miliseconds
        long dateTimestamp = date.getTime();

        long distance = currentTimestamp - dateTimestamp;
        System.out.println("distance: " + distance);
        long age = distance / 1000 / 60 / 60 / 24 / 365;
        /**
         * Seconds: distance / 1000 Minutes: distance / 1000 / 60 Hours:
         * distance / 1000 / 60 / 60 Days: distance / 1000 / 60 / 60 / 24 Years:
         * distance / 1000 / 60 / 60 / 24 / 365
         */
        return age;
    }

}
