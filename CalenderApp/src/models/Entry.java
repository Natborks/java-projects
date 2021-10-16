package models;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;

public abstract class Entry {

    private CustomDate date;
    private CustomTime time;
    private boolean isRepeating;

    public Entry(CustomDate date, CustomTime time, boolean isRepeating){
        this.date = date;
        this.time = time;
        this.isRepeating = isRepeating;
    }

    //EFFECTS: Returns the custom date in the format DD/MM/YYYY
    public String getDate() {
        return date.getDate();
    }

    //SETTER
    public void setDate(CustomDate date) {
        this.date = date;
    }

    //GETTER
    public CustomTime getTime() {
        return time;
    }

    //SETTER
    public void setTime(CustomTime time) {
        this.time = time;
    }

    //GETTER
    public boolean isRepeating() {
        return isRepeating;
    }

    //SETTER
    public void setRepeating(boolean repeating) {
        isRepeating = repeating;
    }

}
