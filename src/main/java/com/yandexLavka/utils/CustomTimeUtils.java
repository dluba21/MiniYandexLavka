package com.yandexLavka.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class CustomTimeUtils {

    public static final boolean START_OF_WORK = true;
    public static final boolean END_OF_WORK = false;
    public static final String HH_MM_REGEX = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]-(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
    private static final String shortTimeFormat = "HH:MM";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern(shortTimeFormat);

    public static LocalTime rawToLocalTime(final String rawFormat, final boolean partFlag) {
        if (!Pattern.matches(HH_MM_REGEX, rawFormat)) {
            throw new RuntimeException("Raw time format doesn't match regex HH:MM-HH:MM");
        }
        final String[] array = rawFormat.split("-");
        if (partFlag == START_OF_WORK) {
            return LocalTime.from(formatter.parse(array[0]));
        }
        return LocalTime.from(formatter.parse(array[1]));
    }

    public static DateTimeFormatter getFormatter() {
        return formatter;
    }
}
