package main;
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

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Classroom getRoompreferred() {
		return roompreferred;
	}

	public void setRoompreferred(Classroom roompreferred) {
		this.roompreferred = roompreferred;
	}

	public int getCapacityrequired() {
		return capacityrequired;
	}

	public void setCapacityrequired(int capacityrequired) {
		this.capacityrequired = capacityrequired;
	}

	public boolean isRejected() {
		return isRejected;
	}

	public void setRejected(boolean isRejected) {
		this.isRejected = isRejected;
	}

	public Date getTimeOfRequest() {
		return timeOfRequest;
	}

	public void setTimeOfRequest(Date timeOfRequest) {
		this.timeOfRequest = timeOfRequest;
	}

	public boolean isAccepted() {
		return isAccepted;
	}
}
