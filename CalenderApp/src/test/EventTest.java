package test;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;
import models.Event;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class EventTest extends EntryTest {

    Event event;

    @Before
    public void setup() {
        customTime = new CustomTime(10, 10);
        customDate = new CustomDate(20, 10, 1995);

        event = new Event(customDate, customTime, false);
    }

    @Test
    public void testGetReminder(){
       String reminder = event.getReminder();

       Assert.assertEquals("James", reminder);
    }

}
