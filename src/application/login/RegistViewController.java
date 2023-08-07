package application.login;

import application.system.Controller;
import application.tools.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistViewController extends Controller{
	@FXML
    private TextField emailInput;

    @FXML
    private TextField passwdInput;

    @FXML
    private TextField phoneInput;

    @FXML
    private TextField userNameInput;
    
    @FXML
    private Button btnHome;
    
    @FXML
    private Button btnRegist;

    @FXML
    void btnRegistClick(ActionEvent event) throws Exception {
    	System.out.println("Handle Recipient Regist Action");
    	String userName = userNameInput.getText();
		String phoneNum = phoneInput.getText();
		String email = emailInput.getText();
		String password = passwdInput.getText();
		if (userName != null && phoneNum != null && email != null && password != null) {
			launchApp.getDatabase().addRecipients(userName, phoneNum, email, password);
			boolean isGoToRecipientView = DialogAlert.confirmDialog("Success Registed", "Press OK to login recipient main view, press Cancel to return login view");
			if(isGoToRecipientView) {
				launchApp.showRecipientMainView();
			}else {
				launchApp.showReciLoginView();
			}
		}
		else {
			DialogAlert.errorDialog("Fail Registed", "Please enter all fields");
		}
    }
    
    @FXML
    void btnHomeClick(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }
    
    public boolean addUser(String name, String password, int secQueIndex, String answer) {
		return false;
		
	}
}




