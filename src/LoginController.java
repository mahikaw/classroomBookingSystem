import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class LoginController implements Initializable {
	@FXML
	public Button Login;
	// Event Listener on Button.onAction
	@FXML
	public void login(ActionEvent event) {
		System.out.println("asdasd");
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
