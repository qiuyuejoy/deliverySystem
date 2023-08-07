package application.login;

import application.model.*;
import application.system.Controller;
import application.tools.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CarrLoginViewController extends Controller{

	@FXML
    private Button btnCarriRegister;

    @FXML
    private Button btnForget;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField passwdInput;

    @FXML
    private TextField userNameInput;
    
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
    	launchApp.showMainView();
    }
}




