package application.login;

import appication.system.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CarrLoginViewController extends Controller{

    @FXML
    private Button btnCarriRegister;

    @FXML
    private Button btnForget;

    @FXML
    private Button btnLogin;
    
    @FXML
    private Button btnReturn;

    @FXML
    void btnCarriRegisterClick(ActionEvent event) throws Exception {
    	launchApp.showRegistView();
    }

    @FXML
    void btnForgetClick(ActionEvent event) throws Exception {
    	launchApp.showForgetView();
    }

    @FXML
    void btnLoginClick(ActionEvent event) throws Exception {
    	
    }
    
    @FXML
    void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }

}




