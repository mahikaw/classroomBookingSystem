package Controllers;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.*;
import org.bson.Document;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RequestRoomController implements Initializable {
    @FXML
    public TextField purpose;
    @FXML
    public TextField room;
    @FXML
    public TextField cap;

    /**
     * submits student request and adds it to admin's list of received requests
     * @param event
     * @throws IOException
     */
    @FXML
    public void submitrequest(ActionEvent event) throws IOException {

        String studentpurpose = purpose.getText();
        String studentroom = room.getText();
        Classroom roomreq = new Classroom(studentroom);//todo pass proper string to constructor
        String roomcap = cap.getText();
        Request req;
        MongoCollection collection = Application.mongoClient
                .getDatabase("db")
                .getCollection("users");

        if (studentroom.isEmpty()) {
            req = new Request(studentpurpose, Integer.parseInt(roomcap));
            if (Admin.ListofRequests.isEmpty()) {
                Admin.ListofRequests.add(0, req);
            } else
                Admin.ListofRequests.add(new Request(studentpurpose, Integer.parseInt(roomcap)));
            Student.requestMade.add(req);
        } else {
            req = new Request(studentpurpose, Integer.parseInt(roomcap), roomreq);
            if (Admin.ListofRequests.isEmpty()) {
                Admin.ListofRequests.add(0, req);
            } else
                Admin.ListofRequests.add(new Request(studentpurpose, Integer.parseInt(roomcap), roomreq));
            Student.requestMade.add(req);
        }
        //todo add request to admin and student db
        Document queryAdmin = new Document("type", "Admin");
        Document queryStudent = new Document("email", Application.currentUser.getUserEmailId());
        Document fieldAdmin = new Document("requestReceived."+req.getRequestID()+".purpose", req.getPurpose())
                .append("requestReceived."+req.getRequestID()+".room", req.getRoompreferred().getClassroom_name())
                .append("requestReceived."+req.getRequestID()+".capacity", req.getCapacityrequired())
                .append("requestReceived."+req.getRequestID()+".isAccepted", req.isAccepted())
                .append("requestReceived."+req.getRequestID()+".isRejected", req.isRejected())
                .append("requestReceived."+req.getRequestID()+".time", req.getTimeOfRequest().toString())
                ;
        Document fieldStudent = new Document("request_made."+req.getRequestID()+".purpose", req.getPurpose())
                .append("request_made."+req.getRequestID()+".room", req.getRoompreferred().getClassroom_name())
                .append("request_made."+req.getRequestID()+".capacity", req.getCapacityrequired())
                .append("request_made."+req.getRequestID()+".isAccepted", req.isAccepted())
                .append("request_made."+req.getRequestID()+".isRejected", req.isRejected())
                .append("request_made."+req.getRequestID()+".time", req.getTimeOfRequest().toString())
                ;

        Document updateStudent = new Document("$set", fieldStudent);
        Document updateAdmin = new Document("$set", fieldAdmin);

        FindOneAndUpdateOptions options = new FindOneAndUpdateOptions()
                .upsert(true)
                .returnDocument(ReturnDocument.AFTER);

        collection.findOneAndUpdate(queryAdmin, updateAdmin, options);
        collection.findOneAndUpdate(queryStudent, updateStudent, options);


//        while (cursor.hasNext()) {
//            Gson g = new Gson();
//            String json = cursor.next().toJson();
//            RootUser a = g.fromJson(json, RootUser.class);
//            if (a.getTypeofuser().compareToIgnoreCase("admin") == 0) {
//
//            }
//        }

        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/StudentHome.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Home");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }

    /**
     * shows student homepage
     * @param event
     * @throws IOException
     */
    @FXML
    public void cancelrequest(ActionEvent event) throws IOException {
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
