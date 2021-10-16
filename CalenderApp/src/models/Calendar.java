package models;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;

import java.util.List;

public class Calendar {
    private CustomDate date;
    private CustomTime time;
    private String email;
    private List<Entry> entries;

    public Calendar(CustomDate date, CustomTime time, String email) {
        this.date = date;
        this.email = email;
    }

    public CustomDate getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry){

    }
}
