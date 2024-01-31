package se.lexicon.dao.impl;

import se.lexicon.dao.MeetingDao;
import se.lexicon.exception.MySQLException;
import se.lexicon.model.Meeting;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class MeetingDaoImpl implements MeetingDao {


    Connection connection;

    public MeetingDaoImpl(Connection connection) {

    }
    @Override
    public Meeting createMeeting(Meeting meeting) {
        System.out.println("inside Create Method");

        try (PreparedStatement preparedStatement = connection.prepareStatement(MeetingDao.CREATE_MEETING_SQL)) {
            Meeting meetings = new Meeting(meeting);
            preparedStatement.setString(1, meeting.getDescription());
            preparedStatement.setString(2, meeting.getTitle());
            preparedStatement.setString(3, meeting.getStartTime().toString());
            preparedStatement.setString(4, meeting.getEndTime().toString());
            preparedStatement.setInt(5, meeting.getId());



            int rowsAffected = preparedStatement.executeUpdate();

             if (rowsAffected == 0) {
                throw new MySQLException(("Creating meeting failed"));

            }
            System.out.println("Meeting created successfully");
            return meeting;

        }catch (SQLException e){
            throw new MySQLException("Error occurred while creating meeting: " + meeting, e);
        }

            }



    @Override
    public Optional<Meeting> findById(int meetingId) {
        return Optional.empty();
    }

    @Override
    public Collection<Meeting> findAllMeetingsByCalenderId(int calenderId) {
        return null;
    }

    @Override
    public boolean deleteMeeting(int meetingId) {
        return false;
    }
}
