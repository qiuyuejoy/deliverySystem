package application.login;

import application.model.*;
import application.system.Controller;
import application.tools.*;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.control.TextField;

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
    	launchApp.showCarrierMainView();
    	//    	String userName = userNameInput.getText();
//		String password = passwdInput.getText();
//		
//		if(UserPasswdCheck.isValidUserName(userName) && UserPasswdCheck.isValidPassword(password)) {
//			Carrier carrier = Database.getCarrier(userName, password);
//			if(carrier != null) {
//				launchApp.setCarrier(carrier);
//				launchApp.showCarrierMainView();
//			}else {
//				userNameInput.clear();
//				passwdInput.clear();
//			}
//		}else {
//			userNameInput.clear();
//			passwdInput.clear();
//		}
    }
    
    @FXML
    void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }

}




