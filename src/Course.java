import java.util.Date;

public class Course {
    private String prerequisite;
    private String postconditions;
    public Date[] CourseTimeSlot_Start;//on Index 0, we store the time at which the class starts on monday, tuesday on 1st....
    public Date[] CourseTimeSlot_End;
    //we will occupy rhe classroom alloted in that perticular time slot only
    private Classroom roomalloted;
    private int inteded_audience;

    public Course(String courseprerequisite, String coursepostconditions, Date stime, Date etime, Classroom allotedroom, int capacity) {
        this.prerequisite = courseprerequisite;
        this.postconditions = coursepostconditions;
        //todo correct beneath
//        this.CourseTimeSlot_Start = stime;
//        this.endTime=etime;
        this.roomalloted = allotedroom;
        this.inteded_audience = capacity;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getPostconditions() {
        return postconditions;
    }
//todo implement them too
//    public String getStartTime() {
//        return startTime.toString();
//    }
//    public String getEndTime() {
//        return endTime.toString();
//    }

    public Classroom getRoomalloted() {
        return roomalloted;
    }

    public int getInteded_audience() {
        return inteded_audience;
    }
}
