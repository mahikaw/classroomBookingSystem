public class Request {
    private String purpose;
    private Classroom roomprefered;
    private int capacityrequired;
    private boolean accepted =false;

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    public Request(String purposeofrequest,int capacity){
        this.purpose=purposeofrequest;
        this.capacityrequired=capacity;
        this.roomprefered=null;
    }
    public Request(String purposeofrequest,int capacity, Classroom classroomrequired){
        this.purpose=purposeofrequest;
        this.capacityrequired=capacity;
        this.roomprefered=classroomrequired;
    }
}
