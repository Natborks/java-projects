package models;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;

public class Reminder extends Entry{

    private String note;

    public Reminder(CustomDate date, CustomTime time, boolean isRepeating) {
        super(date, time, isRepeating);
    }

    //Getter
    public String getNote() {
        return note;
    }

    //Setter
    public void setNote(String note) {
        this.note = note;
    }
}
