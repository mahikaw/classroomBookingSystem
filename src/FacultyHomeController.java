import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.AbstractDocument.Content;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
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
		//System.out.println("asdasd");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
	}
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		//System.out.println(HomeStudent.getChildren().indexOf(pane));
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("AvailableRooms.fxml")));
		
	}
	@FXML
	public void BookRooms(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("Bookroom.fxml")));
	}
	@FXML
	public void CancelRoom(ActionEvent event) throws IOException{
		HomeAdmin.getChildren().clear();
		HomeAdmin.getChildren().add(FXMLLoader.load(getClass().getResource("cancelroom.fxml")));
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
