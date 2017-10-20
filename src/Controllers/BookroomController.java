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
import javafx.stage.Stage;

public class BookroomController implements Initializable{
	@FXML
	public AnchorPane HomeAdmin;
	@FXML
	public void Bookroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
	}
	@FXML
	public void login(ActionEvent event) throws IOException {
		Parent homepage = FXMLLoader.load(getClass().getResource("Login.FXML"));
		//System.out.println("asdasd");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
	}
	@FXML
	public void bookroom(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/Bookroom.fxml")));
	}
	@FXML
	public void cancelroom(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/cancelroom.fxml")));
	}
	@FXML
	public void viewRequests(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/Requests.fxml")));
	}
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		//System.out.println(HomeStudent.getChildren().indexOf(pane));
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.fxml")));
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
