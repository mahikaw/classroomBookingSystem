import java.util.ArrayList;

public class Student extends RootUser {
    ArrayList<Request> requestMade;
    public Student() {
        super.typeofuser = "Student";
        requestMade=new ArrayList<Request>();
    }

    public void requestRoom(String purpose, int capacity) {
    }

    public void requestRoom(String purpose, int capacity, Classroom roomrequired) {

    }

}
