package test;


import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;
import models.Meeting;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MeetingTest extends EventTest{
    Meeting meeting;

    @Before
    public void setup(){
        CustomTime customTime = new CustomTime(10, 10);
        CustomDate customDate = new CustomDate(20, 10, 1995);

        meeting = new Meeting(customDate, customTime, false);
    }

    public void testConstructor(){
        String date = meeting.getDate();

        Assert.assertEquals("20/10/1995", date);
        Assert.assertTrue(meeting.getAttendees().isEmpty());
    }

    @Test
    public void testAddAttendee(){
        Assert.assertTrue(meeting.getAttendees().isEmpty());

        String attendee1 = "attendee1";

        meeting.addAttendee(attendee1);

        Assert.assertEquals(1, meeting.getAttendees().size());
        Assert.assertTrue(meeting.getAttendees().contains(attendee1));
    }
}
