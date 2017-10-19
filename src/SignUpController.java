import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by tgit on 18/10/17.
 */

public class SignUpController implements Initializable {

    @FXML
    public void home(ActionEvent event) {
        try {
            new LoginController().home(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
