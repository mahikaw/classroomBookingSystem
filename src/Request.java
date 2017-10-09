import java.util.Date;

public class Request {
    private String purpose;
    private Classroom roompreferred;
    private int capacityrequired;
    private boolean isAccepted = false;
    private boolean isRejected = false;
    private Date timeOfRequest;

    public Request(String purposeofrequest, int capacity) {
        timeOfRequest = new Date();
        this.purpose = purposeofrequest;
        this.capacityrequired = capacity;
        this.roompreferred = null;
    }

    public Request(String purposeofrequest, int capacity, Classroom classroomrequired) {
        timeOfRequest = new Date();
        this.purpose = purposeofrequest;
        this.capacityrequired = capacity;
        this.roompreferred = classroomrequired;
    }


    public void setAccepted(boolean accepted) {
        this.isAccepted = accepted;
    }
}
