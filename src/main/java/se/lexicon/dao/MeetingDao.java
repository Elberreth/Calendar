package se.lexicon.dao;

import se.lexicon.model.Meeting;

import java.util.Collection;
import java.util.Optional;

public interface MeetingDao {


    String CREATE_MEETING_SQL = "INSERT INTO meetings (TITLE, START_TIME, END_TIME, _DESCRIPTION, CALENDAR_ID) \n" +
            "VALUES (?,?,?,?);";


    String FIND_BY_ID_SQL = "SELECT * FROM meetings WHERE ID = ?;";


    String FIND_ALL_BY_CALENDAR_ID_SQL = "SELECT * FROM meetings WHERE CALENDAR_ID = ?";


    String DELETE_MEETING_SQL = "DELETE FROM meetings WHERE ID = ?;";


    Meeting createMeeting(Meeting meeting);

    Optional<Meeting> findById(int meetingId);

    Collection<Meeting> findAllMeetingsByCalenderId(int calenderId);

    //More Find Methods

    // Add methods for updating meeting as needed...

    boolean deleteMeeting(int meetingId);


}