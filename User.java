package com.company;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private String date;
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public boolean isDate(){
//        String pattern =  "(([0-2][0-9])|(30|31)|([1-9]))([-/.])" +
//                "(([0]?[1-9])|([1][0-2]))(\\5)" +
//                "(([1][9][6-9][0-9])|([2][0][0-1][0-8])" +
//                "|([6-9][0-9])|([0-1][0-8]))";
//        String febr = "(30|31)([-/.])(02|2)(\1)(([1][9][6-9][0-9])|([2][0][0-1][0-8])|([6-9][0-9])|([0-1][0-8]))";
//
//        Matcher m = Pattern.compile(pattern).matcher(date);
//        Matcher m2 = Pattern.compile(febr).matcher(date);
//
//        if(m2.find())
//            return false;
//        if (m.find( )) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//    public String howOld(){
//        int age;
//        int nextBirthday = 0;
//        int dayB;
//        int monthB;
//        int yearB;
//        char splitD = ((date.charAt(2) == '-')||(date.charAt(2) == '/'))? date.charAt(2) : date.charAt(1);
//
//        String[] dates = date.split(String.valueOf(splitD));
//        if(dates[0].charAt(0)=='0')
//            dayB = Integer.parseInt(String.valueOf(dates[0].charAt(1)));
//        else dayB = Integer.parseInt(dates[0]);
//        if(dates[1].charAt(0)=='0')
//            monthB = Integer.parseInt(String.valueOf(dates[1].charAt(1)));
//        else monthB = Integer.parseInt(dates[1]);
//        if(dates[2].length() == 4)
//            yearB = Integer.parseInt(dates[2]);
//        else{
//            int temp = Integer.parseInt(dates[2]);//year can  be 1988 and 88
//            if(temp > 18)
//                yearB = 1900 + temp;
//            else yearB = 2000 + temp;
//        }
//
//        GregorianCalendar gCalendar = new GregorianCalendar();
//
//        int monthT = gCalendar.get(Calendar.MONTH);
//        int dayT = gCalendar.get(Calendar.DATE);
//        int yearT = gCalendar.get(Calendar.YEAR);
//
//        if(monthT > monthB) {
//            age = yearT - yearB;
//        }
//        else if(monthT < monthB) {
//            age = yearT - yearB - 1;
//        }
//        else {
//            if(dayT > dayB) {
//                age = yearT - yearB;
//            }
//            else if(dayT < dayB) {
//                age = yearT - yearB - 1;
//            }
//            else age = yearT - yearB;
//        }
//        nextBirthday += YearMonth.of(yearT, monthT).lengthOfMonth() - dayT;
//        int currentYear = yearT;
//        int k = monthT + 1;
//        while(k != monthB){
//            if(k > 12){
//                k = 1;
//                currentYear++;
//            }
//            if(k != monthB) {
//                nextBirthday += YearMonth.of(currentYear, k).lengthOfMonth();
//                k++;
//            }
//
//        }
//        nextBirthday = nextBirthday + dayB;
//        return "Your age is " + age + ". It's " + nextBirthday + " left to your next birthday";
//    }

}
