import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by tgit on 06/10/17.
 */
public class Application extends javafx.application.Application {

    ArrayList<Course> ListofCourses;


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
    }

    public ArrayList<Course> searchcourses(String keywords) {
        //do search
        int xyz;
        return ListofCourses;
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