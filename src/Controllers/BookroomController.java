package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.Application;
import main.Slot;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class BookroomController implements Initializable {
    @FXML
    public javafx.scene.control.TextField time;
    @FXML
    public javafx.scene.control.TextField day;
    @FXML
    public javafx.scene.control.TextField room;
    @FXML
    public VBox HomeAdmin;

    /**
     * Displays  admin home page
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void Bookroom(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    /**
     * Displays login page of application
     *
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
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void bookroom(ActionEvent event) throws IOException {
        String roomName = room.getText();
        String dayname = day.getText();
        String timings = time.getText();
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        Date start=null, end = null;
        try {
            start = formatter.parse(timings.split("-")[0]);
            end = formatter.parse(timings.split("-")[1]);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Slot s = new Slot(start, end);
        switch (dayname) {
            case "Monday": {
                Application.classrooms.get(roomName).bookings[0].get("Monday").add(s);
                break;
            }
            case "Tuesday": {
                Application.classrooms.get(roomName).bookings[0].get("Tuesday").add(s);
                break;
            }
            case "Wednesday": {
                Application.classrooms.get(roomName).bookings[0].get("Wednesday").add(s);
                break;
            }
            case "Thursday": {
                Application.classrooms.get(roomName).bookings[0].get("Thursday").add(s);
                break;
            }
            case "Friday": {
                Application.classrooms.get(roomName).bookings[0].get("Friday").add(s);
                break;
            }
        }
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
        public void cancelroom (ActionEvent event) throws IOException {
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
        public void viewRequests (ActionEvent event) throws IOException {
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
        public void AvailableRooms (ActionEvent event) throws IOException {
            //System.out.println(HomeStudent.getChildren().indexOf(pane));
            Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AvailableRooms.FXML"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(homepage, 300, 275));
            stage.show();
            stage.setFullScreen(true);

        }

        @Override
        public void initialize (URL location, ResourceBundle resources){
            // TODO Auto-generated method stub

        }

    }
