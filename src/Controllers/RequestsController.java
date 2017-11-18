package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.Admin;
import main.Classroom;
import main.Course;
import main.Request;
import main.TimeTable;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class RequestsController implements Initializable{
	@FXML
	public Button logout;
	@FXML
	public TableView<Request> table;
	@FXML
	public TableColumn<Request,String> room;
	@FXML
	public TableColumn<Request, Integer> capacity;
	@FXML
	public TableColumn<Request, String> purpose;
	@FXML
	public VBox HomeAdmin;
	@FXML
	public Pane pane;
	// Event Listener on Button.onAction
	@FXML
	public void login(ActionEvent event) throws IOException {
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
		stage.setFullScreen(true);
	}

	/**
	 * Shows bookroom page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void bookroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Bookroom.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
		stage.setFullScreen(true);
	}

	/**
	 * Shows cancel room page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void cancelroom(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/cancelroom.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
		stage.setFullScreen(true);
	}

	/**
	 * Shows requests page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void viewRequests(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Requests.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
		stage.setFullScreen(true);
	}

	/**
	 * Shows available rooms page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		//System.out.println(HomeStudent.getChildren().indexOf(pane));
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
		stage.setFullScreen(true);
		
	}

	/**
	 * Shows cancel rooms page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void cancel(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Shows admin home with accepted requests
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void accept(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Loads requests recieved for admin
	 * @throws IOException
	 */
	@FXML
	public void loadRequests() throws IOException{
		//list.setVisible(false);
		final ObservableList<Request> data = FXCollections.observableArrayList(Admin.ListofRequests);
		
		room.setCellValueFactory(new PropertyValueFactory<Request, String>("roompreferred"));
		capacity.setCellValueFactory(new PropertyValueFactory<Request, Integer>("capacityrequired"));
		purpose.setCellValueFactory(new PropertyValueFactory<Request, String>("purpose"));
		
		table.setItems(data);
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		try {
			loadRequests();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
