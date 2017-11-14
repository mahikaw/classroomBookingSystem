package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.Request;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AvailableRoomsController implements Initializable {
    @FXML
    public VBox HomeAdmin;

    public VBox getHomeAdmin() {
        return HomeAdmin;
    }

    public void setHomeAdmin(VBox homeAdmin) {
        HomeAdmin = homeAdmin;
    }

    public TableColumn<Request, String> getRoom() {
        return room;
    }

    public void setRoom(TableColumn<Request, String> room) {
        this.room = room;
    }

    public TableColumn<Request, String> getStart() {
        return start;
    }

    public void setStart(TableColumn<Request, String> start) {
        this.start = start;
    }

    public TableColumn<Request, String> getEnd() {
        return end;
    }

    public void setEnd(TableColumn<Request, String> end) {
        this.end = end;
    }

    @FXML
    public TableColumn<Request, String> room;
    @FXML
    public TableColumn<Request, String> start;
    @FXML
    public TableColumn<Request, String> end;

    @FXML
    public void Bookroom(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/AdminHome.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    public void bookroom(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Bookroom.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    public void cancelroom(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/cancelroom.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    public void viewRequests(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Requests.FXML"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    public void AvailableRooms(ActionEvent event) throws IOException {
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
