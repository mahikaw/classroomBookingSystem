package main;

import java.util.ArrayList;

public class Student extends RootUser {
    public ArrayList<Request> requestMade;

    public Student(String emailID, String pass) {
        super(emailID,pass);
        typeofuser = "Student";
        requestMade = new ArrayList<Request>();
    }

    public void requestRoom(String purpose, int capacity) {
    }

    public void requestRoom(String purpose, int capacity, Classroom roomrequired) {

    }

}
