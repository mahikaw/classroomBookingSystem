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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentHomeController implements Initializable {

	@FXML
	public Button Logout;
	@FXML
	public Button Available_rooms;
	// Event Listener on Button.onAction
	@FXML
	public VBox HomeStudent;
	@FXML
	public Pane pane;
	@FXML
	public void login(ActionEvent event) throws IOException {
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		HomeStudent.getChildren().clear();
		HomeStudent.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.fxml")));
		
	}
	@FXML
	public void RequestRooms(ActionEvent event) throws IOException{
		HomeStudent.getChildren().clear();
		HomeStudent.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/RequestRoom.fxml")));
	}
	@FXML
	public void MyTimeTable(ActionEvent event) throws IOException{
		HomeStudent.getChildren().clear();
		HomeStudent.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/MyTimetable.fxml")));
	}
	@FXML
	public void AddCourse(ActionEvent event) throws IOException{
		HomeStudent.getChildren().clear();
		HomeStudent.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/Timetable.fxml")));
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
