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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FacultyHomeController implements Initializable {

	@FXML
	public Button Logout;
	@FXML
	public Button Available_rooms;
	// Event Listener on Button.onAction
	@FXML
	public VBox HomeAdmin;
	@FXML
	public Pane pane;

	/**
	 * Displays login page of application from faculty home page on clicking logout
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void login(ActionEvent event) throws IOException {

		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.setFullScreen(true);
        stage.show();
        stage.setFullScreen(true);
        
	}

	/**
	 * 	Displays avaialbale rooms page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRoomsFac.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.setFullScreen(true);
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * 	Displays book rooms page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void BookRooms(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/BookRoomFac.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.setFullScreen(true);
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays cancel rooms page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void CancelRoom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/cancelroomFac.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.setFullScreen(true);
        stage.show();
        stage.setFullScreen(true);
	}


	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
