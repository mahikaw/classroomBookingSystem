package Controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.ListView;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by tgit on 22/10/17.
 */
public class MainController implements Initializable {
    @FXML
    ListView list;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        List<String> values = Arrays.asList("one", "two", "three");
//
//        list. (FXCollections.observableList(values));
    }

    /**
     * Shows the login page
     * @param event
     * @throws IOException
     */
    @FXML
    public void loginPage(ActionEvent event) throws IOException {
        Parent homepage = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login page");
        stage.setScene(new Scene(homepage, 300, 275));
        stage.show();
        stage.setFullScreen(true);
    }
}
