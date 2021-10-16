package test;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;
import models.Entry;
import org.junit.Assert;
import org.junit.Test;

public abstract class EntryTest {
    Entry entry;
    CustomTime customTime;
    CustomDate customDate;

    @Test
    public void testConstructor() {
        String eventDate = entry.getDate();
        boolean isRepeating = entry.isRepeating();
        CustomTime eventTime = entry.getTime();


        Assert.assertEquals("20/10/1995", eventDate);
        Assert.assertFalse(isRepeating);
        Assert.assertEquals("10:10", eventTime);
    }
}
