package models;

import DateTimeUtils.CustomDate;
import DateTimeUtils.CustomTime;

import java.util.ArrayList;
import java.util.List;

public class Meeting extends Event{
    private List<String> attendees;

    public Meeting(CustomDate date, CustomTime time, boolean isRepeating) {
        super(date, time, isRepeating);

        attendees = new ArrayList<>();
    }

    public List<String> getAttendees() {
        return attendees;
    }

    //MODIFIES: this
    //EFFECT: Adds attendee to the list of attendees
    public void addAttendee(String attendee){

    }

    //MODIFIES: this
    //EFFECT: Removes attendee from the list of attendess
    public void removeAttendee(String attendee){

    }

    //EFFECT: Sends invitations to attendees
    public void sendInvitations(){

    }
}
