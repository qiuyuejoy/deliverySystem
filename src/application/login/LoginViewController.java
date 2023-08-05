package application.login;

import appication.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginViewController extends Controller{

    @FXML
    private Button btnCarrierLogin;

    @FXML
    private Button btnRecipientLogin;
	
    @FXML
    void btnCarrierLoginClick(ActionEvent event) {
    	getLaunchApp().showCarrLoginView();
    }

    @FXML
    void btnRecipientLoginClick(ActionEvent event) {
    	launchApp.showReciLoginView();
    }
}

