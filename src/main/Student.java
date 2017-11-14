package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends RootUser {
<<<<<<< HEAD
    public static ArrayList<Request> requestMade = new ArrayList<Request>();
    public static HashMap<String, Course> listofcourses = new HashMap<>();
=======
    public static ArrayList<Request> requestMade= new ArrayList<Request>();
    public static HashMap<String,Course> listofcourses= new HashMap<>();
>>>>>>> 9c42440... timetable display

    public Student(String emailID, String pass) {
        super(emailID, pass);
        typeofuser = "Student";

    }

    public void requestRoom(String purpose, int capacity) {
    }

    public void requestRoom(String purpose, int capacity, Classroom roomrequired) {

    }

}
