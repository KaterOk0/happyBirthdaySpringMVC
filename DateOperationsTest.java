package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateOperationsTest {

    private String date1;
    private String date2;
    private String date3;
    private String date4;
    private String date5;
    private String date6;
    private String date7;
    private String date8;
    private String date9;
    private String date10;
    private String date11;
    private String date12;
    private String date13;
    private String date14;
    private String date15;
    private String date16;
    private String date17;
    private String date18;
    private String date19;
    private String year1;
    private String year2;
    private String year3;
    private String year4;
    private String year5;
    private String year6;
    ArrayList<Integer> splittedDate1;
    ArrayList<Integer> splittedDate2;
    ArrayList<Integer> splittedDate3;
    ArrayList<Integer> splittedDate4;
    ArrayList<Integer> splittedDate5;
    ArrayList<Integer> splittedDate6;
    ArrayList<Integer> splittedDate7;
    ArrayList<Integer> splittedDate8;
    ArrayList<Integer> splittedDate9;
    ArrayList<Integer> splittedDate10;
    ArrayList<Integer> splittedDate11;
    ArrayList<Integer> splittedDate12;
    ArrayList<Integer> splittedDate13;
    ArrayList<Integer> splittedDate14;
    ArrayList<Integer> splittedDate15;


    @Before
    public void setUp() throws Exception {

        date1 = "26/06/2011"; //7 269
        date2 = "29/02/2018"; //false
        date3 = "29/02/80";//38 151
        date4 = "12/12/12";//5 72
        date5 = "7/5/2012";//6 218
        date6 = "7/5/12";//6 218
        date7 = "26-06-2011"; //7
        date8 = "29-02-2018";//false
        date9 = "29-02-80";//38
        date10 = "12-12-12";//5
        date11 = "7-5-2012";//5
        date12 = "7-5-12";//6
        date13 = "26.06.2011"; //7
        date14 = "29.02.2018";//false
        date15 = "29.02.80";//38
        date16 = "12.12.12";//5
        date17 = "7.5.2012";//6
        date18 = "7.5.12";//6
        date19 = "aa.bb.cccc";//false
        year1 = "2012";
        year2 = "2013";
        year3 = "1980";
        year4 = "1981";
        year5 = "56";
        year6 = "13";
        splittedDate1 = DateOperations.splittingDate(date1);
        splittedDate2 = DateOperations.splittingDate(date3);
        splittedDate3 = DateOperations.splittingDate(date4);
        splittedDate4 = DateOperations.splittingDate(date5);
        splittedDate5 = DateOperations.splittingDate(date6);
        splittedDate6 = DateOperations.splittingDate(date7);
        splittedDate7 = DateOperations.splittingDate(date9);
        splittedDate8 = DateOperations.splittingDate(date10);
        splittedDate9 = DateOperations.splittingDate(date11);
        splittedDate10 = DateOperations.splittingDate(date12);

    }

    @Test
    public void testCheckDate1() {
        assertTrue(DateOperations.checkDate(date1));
    }

    @Test
    public void testCheckDate2() {
        assertFalse(DateOperations.checkDate(date2));
    }

    @Test
    public void testCheckDate3() {
        assertTrue(DateOperations.checkDate(date3));
    }

    @Test
    public void testCheckDate4() {
        assertTrue(DateOperations.checkDate(date4));
    }

    @Test
    public void testCheckDate5() {
        assertTrue(DateOperations.checkDate(date5));
    }

    @Test
    public void testCheckDate6() {
        assertTrue(DateOperations.checkDate(date6));
    }

    @Test
    public void testCheckDate7() {
        assertTrue(DateOperations.checkDate(date7));
    }

    @Test
    public void testCheckDate8() {
        assertFalse(DateOperations.checkDate(date8));
    }

    @Test
    public void testCheckDate9() {
        assertTrue(DateOperations.checkDate(date9));
    }

    @Test
    public void testCheckDate10() {
        assertTrue(DateOperations.checkDate(date10));
    }

    @Test
    public void testCheckDate11() {
        assertTrue(DateOperations.checkDate(date11));
    }

    @Test
    public void testCheckDate12() {
        assertTrue(DateOperations.checkDate(date12));
    }

    @Test
    public void testCheckDate13() {
        assertTrue(DateOperations.checkDate(date13));
    }

    @Test
    public void testCheckDate14() {
        assertFalse(DateOperations.checkDate(date14));
    }

    @Test
    public void testCheckDate15() {
        assertTrue(DateOperations.checkDate(date15));
    }

    @Test
    public void testCheckDate16() {
        assertTrue(DateOperations.checkDate(date16));
    }

    @Test
    public void testCheckDate17() {
        assertTrue(DateOperations.checkDate(date17));
    }

    @Test
    public void testCheckDate18() {
        assertTrue(DateOperations.checkDate(date18));
    }

    @Test
    public void testCheckDate19() {
        assertFalse(DateOperations.checkDate(date19));
    }

    @Test
    public void testAge1() {
        assertEquals(7, DateOperations.calculateAge(DateOperations.splittingDate(date1)));
    }

    @Test
    public void testAge2() {
        assertEquals(38, DateOperations.calculateAge(DateOperations.splittingDate(date3)));
    }

    @Test
    public void testAge3() {
        assertEquals(5, DateOperations.calculateAge(DateOperations.splittingDate(date4)));
    }

    @Test
    public void testAge4() {
        assertEquals(6, DateOperations.calculateAge(DateOperations.splittingDate(date5)));
    }

    @Test
    public void testAge5() {
        assertEquals(6, DateOperations.calculateAge(DateOperations.splittingDate(date6)));
    }

    @Test
    public void testAge6() {
        assertEquals(7, DateOperations.calculateAge(DateOperations.splittingDate(date7)));
    }

    @Test
    public void testAge7() {
        assertEquals(38, DateOperations.calculateAge(DateOperations.splittingDate(date9)));
    }

    @Test
    public void testAge8() {
        assertEquals(5, DateOperations.calculateAge(DateOperations.splittingDate(date10)));
    }

    @Test
    public void testAge9() {
        assertEquals(6, DateOperations.calculateAge(DateOperations.splittingDate(date11)));
    }

    @Test
    public void testAge10() {
        assertEquals(6, DateOperations.calculateAge(DateOperations.splittingDate(date12)));
    }

    @Test
    public void testCalcDaysToNextBirthday1() {
        System.out.println(splittedDate1);
        assertEquals(269, DateOperations.daysPriorToBirthday(splittedDate1));
    }

    @Test
    public void testCalcDaysToNextBirthday2() {
        assertEquals(151, DateOperations.daysPriorToBirthday(splittedDate2));
    }

    @Test
    public void testCalcDaysToNextBirthday3() {
        assertEquals(73, DateOperations.daysPriorToBirthday(splittedDate3));
    }

    @Test
    public void testCalcDaysToNextBirthday4() {
        assertEquals(219, DateOperations.daysPriorToBirthday(splittedDate4));
    }
    @Test
    public void testCalcDaysToNextBirthday5() {
        assertEquals(219, DateOperations.daysPriorToBirthday(splittedDate5));
    }
    @Test
    public void testCalcDaysToNextBirthday6() {
        System.out.println(splittedDate1);
        assertEquals(269, DateOperations.daysPriorToBirthday(splittedDate6));
    }

    @Test
    public void testCalcDaysToNextBirthday7() {
        assertEquals(151, DateOperations.daysPriorToBirthday(splittedDate7));
    }

    @Test
    public void testCalcDaysToNextBirthday8() {
        assertEquals(73, DateOperations.daysPriorToBirthday(splittedDate8));
    }

    @Test
    public void testCalcDaysToNextBirthday9() {
        assertEquals(219, DateOperations.daysPriorToBirthday(splittedDate9));
    }
    @Test
    public void testCalcDaysToNextBirthday10() {
        assertEquals(219, DateOperations.daysPriorToBirthday(splittedDate10));
    }
}
