package org.mg.intermediate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MinutesBetweenHours {

    private static final String TIME_SEPARATOR = "-";
    private static final String HOUR_REGEX = "h:mm a";
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(HOUR_REGEX);
    private static final int WHOLE_DAY_MINUTES = 1440;

    public static long calc(final String timeExpression) {
        String[] split = timeExpression.split(TIME_SEPARATOR);
        String earlyH = split[0];
        String lateH = split[1];

        earlyH = fitToRegex(earlyH);
        lateH = fitToRegex(lateH);

        final LocalTime earlyTime = LocalTime.parse(earlyH, TIME_FORMATTER);
        final LocalTime laterTime = LocalTime.parse(lateH, TIME_FORMATTER);

        final long timeDiff = ChronoUnit.MINUTES.between(earlyTime, laterTime);

        return isTimeDiffNegative(timeDiff) ? timeDiff + WHOLE_DAY_MINUTES : timeDiff;

    }
    private static boolean isTimeDiffNegative(final long timeDiff) {
        return timeDiff < 0;
    }

    private static String fitToRegex(final String stringHour) {
        final String digits = stringHour.substring(0, stringHour.length() - 2);
        final String dayPhase = stringHour.substring(stringHour.length() - 2);

        return digits + " " + dayPhase;
    }

}
