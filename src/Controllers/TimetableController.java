package Controllers;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.net.URL;
import main.Classroom;
import main.Course;
import main.Request;
import main.Student;
import java.util.ResourceBundle;
import main.Request;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.util.Iterator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TimetableController implements Initializable {
	@FXML
	public TableView<Request> Table;
	@FXML
	public TableColumn<Request, Classroom> room;
 	@FXML
 	public TableColumn<Request, Integer> cap;
 	@FXML
 	public TableColumn<Request, String> pur;
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
				Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms_Student.FXML"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				stage.setTitle("Login");
		        stage.setScene(new Scene(homepage, 300, 275));
		        stage.show();
		        stage.setFullScreen(true);

					}
 	@FXML
 	public void RequestRooms(ActionEvent event) throws IOException{
				Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/RequestRoom.FXML"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        stage.setTitle("Login");
		        stage.setScene(new Scene(homepage, 300, 275));
		        stage.show();
		        stage.setFullScreen(true);
		        	}
 	@FXML
 	public void MyTimeTable(ActionEvent event) throws IOException{
				Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/MyTimetable.FXML"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        stage.setTitle("Login");
		        stage.setScene(new Scene(homepage, 300, 275));
		        stage.show();
		        stage.setFullScreen(true);
			}
 	@FXML
 	public void AddCourse(ActionEvent event) throws IOException{
				Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Addcourse.FXML"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        stage.setTitle("Login");
		        stage.setScene(new Scene(homepage, 300, 275));
		        stage.show();
		        stage.setFullScreen(true);
			}
 	@FXML
 	public void getTimeTable(ActionEvent event) throws IOException{
				Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Timetable.FXML"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		final ObservableList<Request> data = FXCollections.observableArrayList(Student.requestMade);
				room.setCellValueFactory(new PropertyValueFactory<Request, Classroom>("roompreferred"));
				cap.setCellValueFactory(new PropertyValueFactory<Request, Integer>("capacityrequired"));
				pur.setCellValueFactory(new PropertyValueFactory<Request, String>("purpose"));
				Table.setItems(data);
		
	}

}
