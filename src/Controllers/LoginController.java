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

public class LoginController implements Initializable {
    @FXML
    TextArea email;
    @FXML
    TextArea password;

    @FXML
    public void home(ActionEvent event) throws IOException {
        System.out.println("\n\nLOGIN CLICKED\n\n");
        String emailentered = email.getText();
        String passwordentered = password.getText();
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));

        String auth = Application.Authenticate(emailentered, passwordentered);
        System.out.println("authentication function output: "+auth);
        if (auth.split(" ")[0].compareTo("true") == 0) {
            String type = auth.split(" ")[1];

            if (type.toLowerCase().equals("admin")) {
                Application.currentUser = new Admin(emailentered, passwordentered);
                homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
            } else if (type.toLowerCase().equals("faculty")) {
                Application.currentUser = new Faculty(emailentered, passwordentered);
                homepage = FXMLLoader.load(getClass().getResource("../Resources/FacultyHome.fxml"));
            } else if (type.toLowerCase().equals("student")) {
                Application.currentUser = new Student(emailentered, passwordentered);
                homepage = FXMLLoader.load(getClass().getResource("../Resources/StudentHome.fxml"));
            }
        }



        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home page");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    public void signup(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/SignUp.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Sign Up");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}