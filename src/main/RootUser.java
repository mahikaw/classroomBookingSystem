package main;
import java.util.ArrayList;

/**
 * Created by tgit on 06/10/17.
 */
public class RootUser {
    protected String typeofuser;
    private String userEmailId;
    private static ArrayList<Student> StudentArrayList;
    private static ArrayList<Faculty> facultyArrayList;
    private static ArrayList<Classroom> classroomArrayList;
    private static ArrayList<Course> courseArrayList;

    public void logout() {
        //logout user
    }

    protected boolean isRoomAvailable(String roomName) {
        //check availability of room
        return false;
    }
    protected ArrayList<Classroom> getAvailableRooms(int minCapacity){
        ArrayList<Classroom> availableClassrooms=new ArrayList<Classroom>();
        return availableClassrooms;
    }

    protected void cancelRoomBooking(String roomName) {
        //check the availability of the room
    }

    protected void bookRoom(String roomName, String courseName) {
        //book a room for the course
    }


    public String getUserEmailId() {
        return userEmailId;
    }

    public ArrayList<Student> getStudentArrayList() {
        return StudentArrayList;
    }

    public ArrayList<Faculty> getFacultyArrayList() {
        return facultyArrayList;
    }

    public ArrayList<Classroom> getClassroomArrayList() {
        return classroomArrayList;
    }

    public ArrayList<Course> getCourseArrayList() {
        return courseArrayList;
    }

    public String getTypeofuser() {
        return typeofuser;
    }
}
