package Controllers;

import java.awt.*;
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
import main.Application;
import main.Classroom;

public class BookroomController implements Initializable{
	@FXML
	public TextField time;
	@FXML
	public TextField day;
	@FXML
	public TextField room;

	@FXML
	public VBox HomeAdmin;

	/**
	 * Displays  admin home page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void Bookroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays login page of application
	 * @param event
	 * @throws IOException
	 */
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
	 * Books the room
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void bookroom(ActionEvent event) throws IOException{
		Application.classrooms.get()
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Bookroom.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);

	}

	/**
	 * Displays cancel room page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void cancelroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/cancelroom.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays request room page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void viewRequests(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Requests.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays available room page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		//System.out.println(HomeStudent.getChildren().indexOf(pane));
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.FXML"));
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
