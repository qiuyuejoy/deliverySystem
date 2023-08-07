package application.login;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController extends Controller{

    @FXML
    private Button btnCarrierLogin;

    @FXML
    private Button btnRecipientLogin;
	
    @FXML
    void btnCarrierLoginClick(ActionEvent event) throws Exception {
    	launchApp.showCarrLoginView();
    }

    @FXML
    void btnRecipientLoginClick(ActionEvent event) throws Exception {
    	launchApp.showReciLoginView();
    }
}

