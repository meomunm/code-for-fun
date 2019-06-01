package com.example.codeforfun.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {
    public static String formatDateToTime(long date, String type) {
        switch (type) {
            case "HH:mm MM/dd/yyyy":
                return new SimpleDateFormat("HH:mm MM/dd/yyyy", Locale.ENGLISH)
                        .format(new Date(date * 1000L));
            case "HH:mm":
                return new SimpleDateFormat("HH:mm", Locale.ENGLISH)
                        .format(new Date(date * 1000L));
            case "dd/MM":
                return new SimpleDateFormat("dd/MM", Locale.ENGLISH)
                        .format(new Date(date * 1000L));
            default:
                return "";
        }
    }
}
