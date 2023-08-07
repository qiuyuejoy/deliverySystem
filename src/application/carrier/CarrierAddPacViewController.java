package application.carrier;

import application.system.*;
import application.model.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CarrierAddPacViewController extends Controller{
	
	@FXML
    private Button btnConfirm;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField recipientNameInput;

    @FXML
    private TextField trackNumInput;
    
    @FXML
    void btnConfirmClick(ActionEvent event) {

    }

    @FXML
    void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierMainView();
    }
    
}

