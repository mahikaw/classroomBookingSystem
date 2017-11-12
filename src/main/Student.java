package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends RootUser {
    public static ArrayList<Request> requestMade;
    public static HashMap<String,Course> listofcourses= new HashMap<>();

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
