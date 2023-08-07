package application.login;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ForgetViewController extends Controller{
	@FXML
    private TextField userNameInput;
	
	@FXML
    private Button btnHome;
    

    @FXML
    void btnHomeClick(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }

}




