package com.numi.io.common.constants;

import java.time.format.DateTimeFormatter;

public class DateConstants {

    public static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static DateTimeFormatter dfymd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static DateTimeFormatter df00 = DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00");

    public static DateTimeFormatter df99 = DateTimeFormatter.ofPattern("yyyy-MM-dd 23:59:59");


}
