package ui;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;
import models.*;

public class Main {
    public static void main(String[] args) {

        String userEmail = "jamesbond@gmail.com";
        CustomDate currentDate = new CustomDate(10, 10,2020);
        CustomTime time = new CustomTime(10, 19);
        Calendar calendar = new Calendar(currentDate, time, userEmail);

        CustomTime meetingTime= new CustomTime(10, 10);
        CustomDate meetingDate = new CustomDate(20,10,1995);
        Meeting meeting = new Meeting(meetingDate, meetingTime, false);
        calendar.addEntry(meeting);

        CustomTime eventTime= new CustomTime(9, 10);
        CustomDate eventDate = new CustomDate(20,10,1995);
        Event event = new Event(eventDate, eventTime, true);

        calendar.addEntry(event);

        Meeting meeting1 = (Meeting) calendar.getEntries().get(0);
        meeting1.getAttendees();

    }
}
