package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FacultyHomeController implements Initializable {

	@FXML
	public Button Logout;
	@FXML
	public Button Available_rooms;
	// Event Listener on Button.onAction
	@FXML
	public AnchorPane HomeAdmin;
	@FXML
	public Pane pane;
	@FXML
	public void login(ActionEvent event) throws IOException {

		Parent homepage = FXMLLoader.load(getClass().getResource("Login.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.fxml")));
		
	}
	@FXML
	public void BookRooms(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/Bookroom.fxml")));
	}
	@FXML
	public void CancelRoom(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/cancelroom.fxml")));
	}


	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
