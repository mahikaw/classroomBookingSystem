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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Admin;
import main.Classroom;
import main.Request;
import main.Student;

public class RequestRoomController implements Initializable{
	@FXML
	public TextField purpose;
	@FXML
	public TextField room;
	@FXML
	public TextField cap;
	@FXML
	public void submitrequest(ActionEvent event) throws IOException{
		String studentpurpose = purpose.getText();
		String studentroom = room.getText();
		Classroom roomreq = new Classroom(studentroom);
		String roomcap = cap.getText();
		if(studentroom.isEmpty()){
			Request req = new Request(studentpurpose, Integer.parseInt(roomcap));
			if(Admin.ListofRequests.isEmpty()){
				
				Admin.ListofRequests.add(0, req);
			}
			else
				Admin.ListofRequests.add(new Request(studentpurpose, Integer.parseInt(roomcap)));
			Student.requestMade.add(req);
		}
		else{
			Request req = new Request(studentpurpose, Integer.parseInt(roomcap), roomreq);
			if(Admin.ListofRequests.isEmpty()){
				Admin.ListofRequests.add(0,req);
			}
			else
				Admin.ListofRequests.add(new Request(studentpurpose, Integer.parseInt(roomcap), roomreq));
			Student.requestMade.add(req);
		}
		
		//int roomcap = Integer.parseInt(cap.getText());
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/StudentHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}
	@FXML
	public void cancelrequest(ActionEvent event) throws IOException{
		Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/StudentHome.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
	}
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
