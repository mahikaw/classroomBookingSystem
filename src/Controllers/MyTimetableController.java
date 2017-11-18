package Controllers;

import java.io.IOException;
import main.Classes;
import main.Course;
import main.timetable_student;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyTimetableController implements Initializable {
	public Course selected;
	@FXML
	public Button Logout;
	@FXML
	public Button Available_rooms;
	@FXML
	public Button add;
	
	// Event Listener on Button.onAction
	@FXML
	public VBox HomeStudent;
	@FXML
	public Pane pane;
	@FXML
	public TableView<Classes> table ;
	@FXML
	public TableColumn<Classes,String> course_ID;
	@FXML
	public TableColumn<Classes,String> venues;
	@FXML
	public TableColumn<Classes,String> monday;
	@FXML
	public TableColumn<Classes,String> tuesday;
	@FXML
	public TableColumn<Classes,String> wednesday;
	@FXML
	public TableColumn<Classes,String> thursday;
	@FXML
	public TableColumn<Classes,String> friday;

	/**
	 * Shows login page of application
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void login(ActionEvent event) throws IOException {
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Shows available rooms page for student
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void AvailableRooms(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms_Student.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
		
	}

	/**
	 * Shows request rooms
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void RequestRooms(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/RequestRoom.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * displays timetable page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void MyTimeTable(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/MyTimetable.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays add room page
 	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void AddCourse(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Addcourse.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Displays time table page
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void getTimeTable(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Timetable.FXML"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}

	/**
	 * Sets values in cell of timetable
	 */
	@FXML
	public void loadtable(){
		final ObservableList<Classes> data = FXCollections.observableArrayList();
		course_ID.setCellValueFactory(new PropertyValueFactory<Classes,String>("course_ID"));
		venues.setCellValueFactory(new PropertyValueFactory<Classes,String>("venues"));
		monday.setCellValueFactory(new PropertyValueFactory<Classes,String>("monday"));
		tuesday.setCellValueFactory(new PropertyValueFactory<Classes,String>("tuesday"));
		wednesday.setCellValueFactory(new PropertyValueFactory<Classes,String>("wednesday"));
		thursday.setCellValueFactory(new PropertyValueFactory<Classes,String>("thursday"));
		friday.setCellValueFactory(new PropertyValueFactory<Classes,String>("friday"));
		Iterator it = timetable_student.Time_Table.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			data.add((Classes) pair.getValue());
		}
		table.setItems(data);
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loadtable();
	}

}
