import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tgit on 06/10/17.
 */
public class Application extends javafx.application.Application {

    public List<Course> ListofCourses = new ArrayList<Course>();


    //JavaFX components
    Stage mainStage;


    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Resources/Login.fxml"));
        primaryStage.setTitle("IIIT-D Classroom Booking System");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setFullScreen(true);
        primaryStage.show();
        BufferedReader br = new BufferedReader(new FileReader("./src/courses.txt"));
        try {
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                line = br.readLine();
                if (line.isEmpty()) {
                    br.readLine();
                    line = br.readLine();
                    String name = br.readLine();
                    String pre = br.readLine();
                    String desc = br.readLine();
//                    Course newc = new Course(line, name, pre, desc, 50, 4/*(int) title[2].charAt(0)*/);
//                    ListofCourses.add(newc);
                }
            }
        } finally {
            br.close();
        }
        TimeTable t = new TimeTable(new HashMap<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        t.read();
        t.showTimetable();
    }

    public ArrayList<Course> searchcourses(String keywords) {
        //do search
        int xyz;
        return (ArrayList<Course>) ListofCourses;
    }

    public void addcourse(Course addcourse) {
        int xyz;
        ListofCourses.add(addcourse);
    }


    public boolean Authenticate() {
        //authenticate user
        int xyz;
        return true;

    }
}