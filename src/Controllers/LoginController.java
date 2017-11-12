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
import main.Application;
import main.RootUser;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    TextArea email;
    @FXML
    TextArea password;

    @FXML
    public void home(ActionEvent event) throws IOException {
        String emailentered = email.getText();
        String passwordentered = password.getText();
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));

        Iterator<RootUser> it = Application.users.iterator();
        boolean userAuthenticated = false;
        while (it.hasNext()) {
            RootUser temp = it.next();
            if ((temp.getUserEmailId().compareToIgnoreCase(emailentered) == 0) && (temp.getPassword()).compareTo(passwordentered) == 0) {
                userAuthenticated = true;
                if (temp.getTypeofuser().toLowerCase().equals("admin"))
                    homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
                else if (temp.getTypeofuser().toLowerCase().equals("faculty"))
                    homepage = FXMLLoader.load(getClass().getResource("../Resources/FacultyHome.fxml"));
                else if (temp.getTypeofuser().toLowerCase().equals("student"))
                    homepage = FXMLLoader.load(getClass().getResource("../Resources/StudentHome.fxml"));
                break;
            }

        }
        if(!userAuthenticated){
            System.out.println("Wrong credentials");
            homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));
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