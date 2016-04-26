package com.object;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by 周振平
 * on 2016/4/10 15:49
 * 判断一个人是否在1946到1964年出生
 */
public class Person {

    private final Date birthDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >=0 &&
                birthDate.compareTo(BOOM_END) <0;
    }

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

}
