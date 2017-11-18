package Controllers;

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
import main.Application;
import main.Classroom;
import main.Slot;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

public class AvailableRooms_StudentController implements Initializable {

    @FXML
    public Button Logout;
    @FXML
    public Button Available_rooms;
    // Event Listener on Button.onAction
    @FXML
    public TableView<Slot> table;
    @FXML
    public VBox HomeStudent;
    @FXML
    public Pane pane;
    @FXML
    public TableColumn<Slot, String> room;
    @FXML
    public TableColumn<Slot, String> start;
    @FXML
    public TableColumn<Slot, String> end;

    /**
     * Displays login page of the application
     *
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
     * Displays available rooms page
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void AvailableRooms(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);

    }

    /**
     * Displays the requests made y student so far
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void RequestRooms(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/RequestRoom.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    /**
     * Displays student timetable acoording to the courses selected
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void MyTimeTable(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/MyTimetable.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    /**
     * Displays add courses page
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void AddCourse(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Addcourse.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    /**
     * Shows timetable page
     *
     * @param event
     * @throws IOException
     */

    @FXML
    public void getTimeTable(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Timetable.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    public void loadtable() {
        final ObservableList<Slot> data = FXCollections.observableArrayList();

        room.setCellValueFactory(new PropertyValueFactory<Slot, String>("room"));
        start.setCellValueFactory(new PropertyValueFactory<Slot, String>("start"));
        end.setCellValueFactory(new PropertyValueFactory<Slot, String>("end"));
        Iterator i = Application.classrooms.entrySet().iterator();
//        Iterator it;
        while (i.hasNext()) {
            Classroom c = (Classroom) i;
            for (int k = 0; k < 5; k++) {
//                c.bookings[k].get()
                switch (k) {
                    case 0: {
                        for (Slot s : c.bookings[k].get("Monday")) {
                            data.add(s);
                        }
                        break;
                    }
                    case 1: {
                        for (Slot s : c.bookings[k].get("Tuesday")) {
                            data.add(s);
                        }
                        break;
                    }
                    case 2: {
                        for (Slot s : c.bookings[k].get("Wednesday")) {
                            data.add(s);
                        }
                        break;
                    }
                    case 3: {
                        for (Slot s : c.bookings[k].get("Thursday")) {
                            data.add(s);
                        }
                        break;
                    }
                    case 4: {
                        for (Slot s : c.bookings[k].get("Friday")) {
                            data.add(s);
                        }
                        break;
                    }
                }
            }
//            while (it.hasNext()) {
//
//            }
        }
//		for (Classroom A: Application.classrooms) {
//			Iterator it = Application.classrooms.get("")
//					.Time_Table.entrySet().iterator();

//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry) it.next();
//            data.add((Classes) pair.getValue());
//        }
        table.setItems(data);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        loadtable();
    }


}
