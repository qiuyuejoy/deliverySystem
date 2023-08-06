package application.login;

import appication.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ReciLoginViewController extends Controller{
	@FXML
    private Button btnForget;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegist;

    @FXML
    private Button btnReturnHome;

    @FXML
    void btnForgetClick(ActionEvent event) throws Exception {
    	launchApp.showForgetView();
    }

    @FXML
    void btnLoginClick(ActionEvent event) {

    }

    @FXML
    void btnRegistClick(ActionEvent event) throws Exception {
    	launchApp.showRegistView();
    }

    @FXML
    void btnReturnHomeClick(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }
}


