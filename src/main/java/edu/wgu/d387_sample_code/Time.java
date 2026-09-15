package edu.wgu.d387_sample_code;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static String MeetingTime() {


        LocalDate date = LocalDate.of(2027, 1, 1);
        LocalTime selectedTime = LocalTime.of(8,45);

        ZonedDateTime time = ZonedDateTime.of(date,selectedTime,ZoneId.of("America/Vancouver"));

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/Toronto"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Edmonton"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");

        String times = MT.format(timeFormat) + " MT, " + ET.format(timeFormat) + " ET, " + UTC.format(timeFormat) + " UTC";

        return times;


    }




}
