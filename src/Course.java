public class Course {
    private String prerequisite;
    private String postconditions;
    private String timeslot;
    private Classroom roomalloted;
    private int inteded_audience;
    public Course(String courseprerequisite, String coursepostconditions, String time,Classroom allotedroom,int capacity){
        this.prerequisite=courseprerequisite;
        this.postconditions=coursepostconditions;
        this.timeslot=time;
        this.roomalloted=allotedroom;
        this.inteded_audience=capacity;
    }
    public void addcourse(String prerequisites, String postconditions, String time,Classroom allotedroom,int capacity){
        //Course newcourse = new Course(prerequisites,postconditions,time,allotedroom,capacity);
        //addcourse(newcourse);
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getPostconditions() {
        return postconditions;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public Classroom getRoomalloted() {
        return roomalloted;
    }

    public int getInteded_audience() {
        return inteded_audience;
    }
}
