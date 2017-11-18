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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookRoomFacController implements Initializable{
	@FXML
	public VBox HomeAdmin;

	/**
	 * Displays book room page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void Bookroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/FacultyHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}
	@FXML
	public void login(ActionEvent event) throws IOException {
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays book room page for faculty
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void bookroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/BookroomFac.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays cancel room page for faculty
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void cancelroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/cancelroomFac.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays available room page for faculty
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		//System.out.println(HomeStudent.getChildren().indexOf(pane));
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRoomsFac.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
