import java.util.Date;

public class Course {
    private String prerequisite;
    private String postconditions;
    private Date startTime;
    private Date endTime;
    private Classroom roomalloted;
    private int inteded_audience;

    public Course(String courseprerequisite, String coursepostconditions, Date stime, Date etime, Classroom allotedroom, int capacity) {
        this.prerequisite = courseprerequisite;
        this.postconditions = coursepostconditions;
        this.startTime = stime;
        this.endTime=etime;
        this.roomalloted = allotedroom;
        this.inteded_audience = capacity;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getPostconditions() {
        return postconditions;
    }

    public String getStartTime() {
        return startTime.toString();
    }
    public String getEndTime() {
        return endTime.toString();
    }

    public Classroom getRoomalloted() {
        return roomalloted;
    }

    public int getInteded_audience() {
        return inteded_audience;
    }
}
