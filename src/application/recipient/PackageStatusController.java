package application.recipient;

import application.system.Controller;
import application.tools.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PackageStatusController extends Controller{
	
	@FXML
    private Button btnConfirm;

    @FXML
    private Button btnHome;

    @FXML
    private Label btnReplyMessage;

    @FXML
    private TextField trackingNumInput;

    @FXML
    void ClickComfirm(ActionEvent event) {
    	String trackNum = trackingNumInput.getText();
    	if (Database.findDelivery(trackNum) == null) {
    		btnReplyMessage.setText("Dit not find your package, Please check your tracking number");	
    	}
    	else {
    		boolean status = Database.getPackageStatus(trackNum);
    		if (status == true) {
    			btnReplyMessage.setText("Your package status has bees signed");
    		}
    		else {
    			btnReplyMessage.setText("Your package status is on the way");	
    		}	
    	}
    }
}
