package Controllers;

import com.google.gson.Gson;
import com.mongodb.*;
import com.mongodb.client.MongoCursor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import main.*;
import org.bson.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by tgit on 18/10/17.
 */

public class SignUpController implements Initializable {

    @FXML
    private TextArea type;

    @FXML
    private TextArea email;

    @FXML
    private TextArea password;

    /**
     * takes in emailID andd password entered at the time of sign up and stores them into databse for future reference
     * @param event
     * @throws ClassNotFoundException
     * @throws IOException
     */
    @FXML
    public void home(ActionEvent event) throws ClassNotFoundException, IOException {
        RootUser newUser = null;
        String typeOfUser = type.getText();
        String emailID = email.getText();
        String pass = password.getText();

        MongoCursor<Document> cursor = Application.mongoClient
                .getDatabase("db")
                .getCollection("users")
                .find().iterator();

        //check if user exists already
        while (cursor.hasNext()) {
            Gson g = new Gson();
            String json = cursor.next().toJson();
            if (g.fromJson(json, RootUser.class).getUserEmailId().compareToIgnoreCase(emailID) == 0) {
                System.out.println("USER ALREADY EXISTS");//todo show it on ui
                return;
            }
        }

        //check id iiitd.ac.in email ID
        if (emailID.contains("@iiitd.ac.in") == false) {
            System.out.println("Please use your IIITD email ID as your username");
            return;
        }
//        System.out.println(typeOfUser);
//        System.out.println(emailID);
//        System.out.println(pass);
        switch (typeOfUser.toLowerCase()) {
            case "admin": {
                newUser = new Admin(emailID, pass);
                break;
            }
            case "student": {
                newUser = new Student(emailID, pass);
                break;
            }
            case "faculty": {
                newUser = new Faculty(emailID, pass);
                break;
            }
            default: //todo throw exception/show error
        }

//        Application.users.add(newUser);
//        try {
        RootUser.serialize(newUser);
        System.out.println("Signed up new user");
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home page");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            new LoginController().home(event);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * Re-loads login page on clicking back button on sign up page
     * @param event
     * @throws IOException
     */
    @FXML
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("IIIT-D Classroom Booking System");
        stage.setScene(new Scene(root, 300, 275));
        stage.setFullScreen(true);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}