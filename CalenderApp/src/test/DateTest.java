package test;

import DateTimeUtils.CustomDate;
import org.junit.Before;
import org.junit.Test;

public class DateTest {
    CustomDate date;

    @Before
    public void setup(){
        date = new CustomDate(10, 10 , 1994);
    }

    @Test
    public void getConstructor(){
        CustomDate customDate = new CustomDate(20, 05, 2020);

        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        org.junit.Assert.assertEquals(20, customDate.getDay());
        org.junit.Assert.assertEquals(05, customDate.getMonth());
        org.junit.Assert.assertEquals(2020, customDate.getYear());

        org.junit.Assert.assertEquals(10, date.getMonth());
        org.junit.Assert.assertEquals(10, date.getMonth());
        org.junit.Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testGetDate(){
        String dateResult = date.getDate();

        org.junit.Assert.assertEquals(dateResult, "10/10/1994");
    }
}
