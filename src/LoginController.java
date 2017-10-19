import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;

public class LoginController implements Initializable{

    @FXML
    TextArea newUser=new TextArea("Are you a new user?");

    public TextArea getNewUser(){
        return newUser;
    }
	@FXML
    public void home(ActionEvent event) throws IOException {
		Parent homepage = FXMLLoader.load(getClass().getResource("Home.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home page");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

    @FXML
    public void signup(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
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
