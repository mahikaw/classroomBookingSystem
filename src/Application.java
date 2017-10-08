import java.util.ArrayList;

/**
 * Created by tgit on 06/10/17.
 */
public class Application {
 ArrayList<Course> ListofCourses;

    public ArrayList<Course> searchcourses(String keywords) {
        //do search
        return ListofCourses;
    }
    public void addcourse(Course addcourse){
        ListofCourses.add(addcourse);
    }
    public boolean Authenticate(){
        //authenticate user
        return false;
    }
}