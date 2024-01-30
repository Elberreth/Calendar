package se.lexicon.Calendar;

import java.util.List;

public class Meeting {
    private int id;
    private String title;
    private String username;
    private List<Meeting> meetings;



    public Meeting(int id, String title, String username, List<Meeting> meetings) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.meetings = meetings;
    }



    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }







    public List<Meeting> getMeetings() {
        return meetings;
    }





    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void removeMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    public void displayMeetingCalendar() {
        System.out.println("Meeting Calendar " + username + ":");
        for (Meeting meeting : meetings) {
            System.out.println(meeting.toString());
        }
    }
}
