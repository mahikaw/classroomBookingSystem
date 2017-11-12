package Controllers;

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

    @FXML
    public void home(ActionEvent event) throws ClassNotFoundException, IOException {
        RootUser newUser = null;
        String typeOfUser = type.getText();
        String emailID = email.getText();
        String pass = password.getText();
        System.out.println(typeOfUser);
        System.out.println(emailID);
        System.out.println(pass);
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
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            new LoginController().home(event);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

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