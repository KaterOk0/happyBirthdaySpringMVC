package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class DateOperations {
    private static final String RIGHT_DATE_REG_EXP = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|" +
            "(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|" +
            "(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
            "^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
            "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|" +
            "(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|" +
            "(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final int FOUR_DIGIT_YEAR = 4;
    private static final int FIRST_YEAR_OF_21_CENTURY = 2000;
    private static final int FIRST_YEAR_OF_20_CENTURY = 1900;
    private static final int NULL_YEARS = 0;
    private static final int LAST_YEAR_OF_20_CENTURY = 99;

    public static boolean checkDate(String dateFormat) {
        return dateFormat.matches(RIGHT_DATE_REG_EXP);
    }

    public static int calculateAge(ArrayList<Integer> birth) {
        LocalDate birthDate = LocalDate.of(birth.get(0), birth.get(1), birth.get(2));
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    /*private static int daysInCurrentYear() {
        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        int days = 366;
        int check1 = currentYear % 4;
        int check2 = currentYear % 100;
        int check3 = currentYear % 400;
        if (check1 == 0) {
            if (check2 == 0 && check3 != 0)
                days = 365;
        } else
            days = 365;
        return days;
    }

    public static int daysPriorToBirthday(ArrayList<Integer> birth) {
        String[] arr = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        Date currentDate = new Date(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        Date extraDate = new Date(currentDate.getYear(), birth.get(1), birth.get(2));
        long difference = currentDate.getTime() - extraDate.getTime();
        int res = (int) Math.abs(difference / (24 * 60 * 60 * 1000));
        if (currentDate.before(extraDate))
            return res;
        else {
            return daysInCurrentYear() - res;
        }
    }*/

    public static long daysPriorToBirthday(ArrayList<Integer> birth) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(birth.get(0), birth.get(1), birth.get(2));
        LocalDate nextBDay = birthday.withYear(today.getYear());

        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }
        return ChronoUnit.DAYS.between(today, nextBDay);
    }

    private static int extra(String year) {
        int l = year.length();
        if (l == FOUR_DIGIT_YEAR)
            return Integer.parseInt(year);
        else {
            int additionalPartOfYear  = Integer.parseInt(year);
            int border = Integer.parseInt(new SimpleDateFormat("yy").format(new Date()));
            if (additionalPartOfYear  >= NULL_YEARS && additionalPartOfYear  <= border)
                return FIRST_YEAR_OF_21_CENTURY + additionalPartOfYear;
            else if (additionalPartOfYear  >= border && additionalPartOfYear  <= LAST_YEAR_OF_20_CENTURY)
                return FIRST_YEAR_OF_20_CENTURY + additionalPartOfYear;
        }
        return NULL_YEARS;
    }

    public static ArrayList<Integer> splittingDate(String date) {
        ArrayList<Integer> resDate = new ArrayList<>();
        String[] slash = date.split("/");
        String[] hyphen = date.split("-");
        if (hyphen.length != 0 && slash.length == 1) {
            resDate.add(extra(hyphen[2]));
            resDate.add(Integer.parseInt(hyphen[1]));
            resDate.add(Integer.parseInt(hyphen[0]));
        }
        else if (slash.length != 0 && hyphen.length == 1) {
            resDate.add(extra(slash[2]));
            resDate.add(Integer.parseInt(slash[1]));
            resDate.add(Integer.parseInt(slash[0]));
        }
        // без ограничений наш формат будет ГОД-МЕСЯЦ-ДЕНЬ
        return resDate;
    }
}
