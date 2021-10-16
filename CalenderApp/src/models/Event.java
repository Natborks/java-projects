package models;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;

public class Event extends Entry{
    private String reminder;

    public Event(CustomDate date, CustomTime time, boolean isRepeating) {
        super(date, time, isRepeating);
    }

    //GETTER
    public String getReminder() {
        return reminder;
    }

    //SETTER
    public void setReminder(String reminder) {
        this.reminder = reminder;
    }
}
