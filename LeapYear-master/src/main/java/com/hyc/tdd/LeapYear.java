package com.hyc.tdd;

/*
 * Created with eclipse.
 * User: Sulabh Soneji
 * Date: 4/5/2020
 */
public class LeapYear {

    public static boolean isLeapYear(int year_in) {
        if (year_in % 100 == 0 && year_in % 400 != 0) {
            return false;
        }
        return (year_in % 4 == 0);
    }

}
