package application.regist;

import application.system.Controller;
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
//    	String userName = userNameInput.getText();
//		String password = passwdInput.getText();
    }
    
    @FXML
    void btnHomeClick(ActionEvent event) throws Exception {
    	launchApp.showLoginView();
    }
    
    public boolean addUser(String name, String password, int secQueIndex, String answer) {
		return false;
		
	}
}




