package Controllers;

import java.io.IOException;
import main.Course;
import java.net.URL;
import main.TimeTable;

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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
	public TableView<Course> Table ;
	@FXML
	public TableColumn<Course,String> namecol;
	@FXML
	public TableColumn<Course,String> codecol;
	@FXML
	public TableColumn<Course,String> typecol;
	@FXML
	public TableColumn<Course,String> instructorcol;
	@FXML
	public TableColumn<Course,String> acronymcol;
	@FXML
	public TableColumn<Course,String> precol;
	@FXML
	public TableColumn<Course,String> postcol;
	@FXML
	public TextField keyword; 
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
	public void search(ActionEvent event) throws IOException{
		//list.setVisible(false);
		final ObservableList<Course> data = FXCollections.observableArrayList();
		String keyw = keyword.getText();
		namecol.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
		codecol.setCellValueFactory(new PropertyValueFactory<Course, String>("course_ID"));
		typecol.setCellValueFactory(new PropertyValueFactory<Course, String>("type"));
		instructorcol.setCellValueFactory(new PropertyValueFactory<Course, String>("instructor_name"));
		acronymcol.setCellValueFactory(new PropertyValueFactory<Course, String>("course_acronym"));
		precol.setCellValueFactory(new PropertyValueFactory<Course, String>("prerequisite"));
		postcol.setCellValueFactory(new PropertyValueFactory<Course, String>("postconditions"));
		 Iterator it = TimeTable.course_pre.entrySet().iterator();
		    while (it.hasNext()) {
		    	//if(!keyw.isEmpty()){
		        Map.Entry pair = (Map.Entry)it.next();
		        //System.out.println(pair.getValue());
		        if(pair.getKey().toString().toLowerCase().contains(keyw.toLowerCase())){
		        	data.add((Course) pair.getValue());//}
		        }
		    }
		Table.setItems(data);
		//Table.
		//System.out.println("Asdasdasdasdasdasdas");
		
		// initialize listview
		 //list.setItems(list);
		//Application.ListofCourses
		//list.setItems(Application.ListofCourses);
		
		
		
		//System.out.println(keyword.getText());
		//System.out.println(Application.ListofCourses.get(5));
		
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
		
	}

}
