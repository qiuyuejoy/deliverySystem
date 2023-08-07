package application.login;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ReciLoginViewController extends Controller{

    @FXML
    private Button btnForget;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegist;

    @FXML
    private Button btnReturn;
    
    @FXML
    private TextField passwdInput;

    @FXML
    private TextField userNameInput;
    
    @FXML
    void ClickForget(ActionEvent event) throws Exception {
    	launchApp.showForgetView();
    }

    @FXML
    void ClickLogin(ActionEvent event) throws Exception {
    	launchApp.showRecipientMainView();
//    	String userName = userNameInput.getText();
//		String password = passwdInput.getText();
//		
//		if(UserPasswdCheck.isValidUserName(userName) && UserPasswdCheck.isValidPassword(password)) {
//			Carrier carrier = Database.getCarrier(userName, password);
//			if(carrier != null) {
//				launchApp.setCarrier(carrier);
//				launchApp.showRecipientMainView();
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
    void ClickRegist(ActionEvent event) throws Exception {
    	launchApp.showRegistView();
    }

    @FXML
    void ClickReturn(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }
}




