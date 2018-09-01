package com.lcw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Util Tools Java
 */
public class Util {

    public Util() {}

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Util util = new Util();
        util.outputDateString(new Date(0L), "1970-01-01 00:00:00");
    }

    private void outputDateString(Date d, String s) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(d));
        try {
            System.out.println(dateFormat.parse(s).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
