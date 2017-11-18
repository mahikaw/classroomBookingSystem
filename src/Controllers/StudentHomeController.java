package Controllers;

import java.io.IOException;
import main.Course;
import main.Student;

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
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentHomeController implements Initializable {
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

	/**
	 * Displays login page for application
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
	 * Shows available rooms page for students
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
	 * Shows requests room page
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
	 * Shows time table
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
	 * Shows add course page
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

	public boolean contains(String[] array,String data){
		for(int i=0;i<array.length;i++){
			if(data.contains(array[i]))
				return true;
		}
		return false;
		}

	/**
	 * search for courses in add courses page according to their post conditions
 	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void search(ActionEvent event) throws IOException{
		final ObservableList<Course> data = FXCollections.observableArrayList();
		String keyw = keyword.getText();
		String[] words = keyw.split(",");
		namecol.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
		codecol.setCellValueFactory(new PropertyValueFactory<Course, String>("course_ID"));
		typecol.setCellValueFactory(new PropertyValueFactory<Course, String>("type"));
		instructorcol.setCellValueFactory(new PropertyValueFactory<Course, String>("instructor_name"));
		acronymcol.setCellValueFactory(new PropertyValueFactory<Course, String>("course_acronym"));
		precol.setCellValueFactory(new PropertyValueFactory<Course, String>("prerequisite"));
		postcol.setCellValueFactory(new PropertyValueFactory<Course, String>("postconditions"));
		 Iterator it = TimeTable.course_pre.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
				if(contains(words,pair.getKey().toString().toLowerCase())){
		        	data.add((Course) pair.getValue());//}
		        }
		    }
		Table.setItems(data);
		System.out.println("asdasdasdasdasdasd");
		add(event);
		
		
		
	}

	/**
	 * adds courses to student timetable from search results
	 * @param event
	 */
	@FXML
	public void add(ActionEvent event){
		//public Course selected;
		final ObservableList<Course> data = FXCollections.observableArrayList();
		String keyw = keyword.getText();
		String[] words = keyw.split(",");
		namecol.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
		codecol.setCellValueFactory(new PropertyValueFactory<Course, String>("course_ID"));
		typecol.setCellValueFactory(new PropertyValueFactory<Course, String>("type"));
		instructorcol.setCellValueFactory(new PropertyValueFactory<Course, String>("instructor_name"));
		acronymcol.setCellValueFactory(new PropertyValueFactory<Course, String>("course_acronym"));
		precol.setCellValueFactory(new PropertyValueFactory<Course, String>("prerequisite"));
		postcol.setCellValueFactory(new PropertyValueFactory<Course, String>("postconditions"));
		 Iterator it = TimeTable.course_pre.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
				if(contains(words,pair.getKey().toString().toLowerCase())){
					if(pair.getKey().equals("HSS2xx")||pair.getKey().equals("HSS2IDE")||pair.getKey().equals("HSS202")||pair.getKey().equals("HSS204")||pair.getKey().equals("HSS208")||pair.getKey().equals("HSS211")||pair.getKey().equals("HSS2ES")||pair.getKey().equals("HSS2ISI")||pair.getKey().equals("HSS223A")){
						if(Student.listofcourses.containsKey("HSS2xx")||Student.listofcourses.containsKey("HSS2IDE")||Student.listofcourses.containsKey("HSS202")||Student.listofcourses.containsKey("HSS204")||Student.listofcourses.containsKey("HSS208")||Student.listofcourses.containsKey("HSS211")||Student.listofcourses.containsKey("HSS2ES")||Student.listofcourses.containsKey("HSS2ISI")||Student.listofcourses.containsKey("HSS223A")){
							System.out.println();
						}
					}
							
					else		
						data.add((Course) pair.getValue());//}
		        }
		    }
		Table.setItems(data);
		add.setDisable(false);
		//System.out.println("adasd");
		Table.setRowFactory(tv->{
			TableRow<Course>row = new TableRow<>();
			row.setOnMouseClicked(eventmouse -> {
				if(((MouseEvent) eventmouse).getClickCount()==2 &&(!row.isEmpty())){
					
					//add.setDisable(false);
					Course rowdata = row.getItem();
					if(rowdata.getCourse_ID().contains("HSS")){
						System.out.println("asdasdasdasdasdasdasd-------------------------------------zzzz");
						int flag =0;
						Iterator find = Student.listofcourses.entrySet().iterator();
							Map.Entry f = (Map.Entry)find.next();
							if(Student.listofcourses.containsKey("HSS2xx")||Student.listofcourses.containsKey("HSS2IDE")||Student.listofcourses.containsKey("HSS202")||Student.listofcourses.containsKey("HSS204")||Student.listofcourses.containsKey("HSS208")||Student.listofcourses.containsKey("HSS211")||Student.listofcourses.containsKey("HSS2ES")||Student.listofcourses.containsKey("HSS2ISI")||Student.listofcourses.containsKey("HSS223A")){
								flag=1;
								System.out.println("jhgjhfghdghdhjghfghfdgfjghfghjgfdxxxxxxxxxxxxxxxxxxxx");
							}
							else{
								Student.listofcourses.put(rowdata.getCourse_ID(), rowdata);
							}
						
					}
					else{
					Student.listofcourses.put(rowdata.getCourse_ID(), rowdata);
					selected = rowdata;}
					System.out.println(selected);
				}
			});
			return row;
		});
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println(Student.listofcourses);

	}

	/**
	 * Displays student time table
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
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
