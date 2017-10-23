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

    /*public void login(ActionEvent event) throws IOException {
//        Parent homepage = FXMLLoader.load(getClass().getResource("Login.fxml"));
//        Parent errorpage = FXMLLoader.load(getClass().getResource("ErrorLogin.fxml"));
//        System.out.println("LOGIN BUTTON PRESSED");
//        if (Authenticate()) {
//            mainStage.setScene(new Scene(homepage, 300, 275));
//        }
//        else mainStage.setScene(new Scene(errorpage,300,275));
    }*/

    public boolean Authenticate() {
        //authenticate user
        int xyz;
        return true;

    }
}