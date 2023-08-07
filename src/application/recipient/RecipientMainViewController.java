package application.recipient;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RecipientMainViewController extends Controller{

	@FXML
    private Button btnConfirm;

    @FXML
    private Button btnPreference;

    @FXML
    private Button btnRate;

    @FXML
    private Button btnStatus;
    
    @FXML
    private Button btnHome;

    @FXML
    void btnConfirmClick(ActionEvent event) {

    }

    @FXML
    void btnPreferenceClick(ActionEvent event) {

    }

    @FXML
    void btnRateClick(ActionEvent event) {

    }

    @FXML
    void btnStatusClick(ActionEvent event) throws Exception {
    	launchApp.showPackageStatus();
    }

}





