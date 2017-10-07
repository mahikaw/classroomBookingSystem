import java.util.ArrayList;

/**
 * Created by tgit on 06/10/17.
 */
public class RootUser {
    private ArrayList<Student> StudentArrayList;
    private ArrayList<Faculty> facultyArrayList;
    private ArrayList<Classroom> classroomArrayList;
    private ArrayList<Course> courseArrayList;
    public ArrayList<Request> ListofRequests;
    public boolean login(String passowrdEntered){
        return false;
    }
    private String EmailId;
    public void logout(){
        //logout user
    }
    protected boolean isRoomAvailable(String roomName){
        //check availability of room
        return false;
    }
    protected void cancelRoomBooking(String roomName){
    //check the availability of the room
    }

    protected void bookRoom(String roomName,String course){
    //book a room for the course
    }





}
