package com.team.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class DateHelper {

    private static SimpleDateFormat fmFrom = new SimpleDateFormat("dd-MM-yyyy");
    private static SimpleDateFormat fmTo = new SimpleDateFormat("yyyy-MM-dd");

    public static String changeDateToYMD(String date) {
        Date d = null;
        try {
            d = fmFrom.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fmTo.format(d);
    }

    public static String changeDateToDMT(String date) {
        Date d = null;
        try {
            d = fmTo.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fmFrom.format(d);
    }

}
