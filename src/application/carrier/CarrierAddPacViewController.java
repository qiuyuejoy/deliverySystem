package application.carrier;

import javafx.event.ActionEvent;

import appication.system.Controller;
import application.model.Carrier;
import application.model.Delivery;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CarrierAddPacViewController extends Controller{
	
        @FXML
        
// return home       
        private Button btnConfirm;

	    @FXML
	    private TextField recipientNameInput;

	    @FXML
	    private TextField trackNumImput;

	    private Carrier curCarrier;
	    
	    void AppPackage (){
	    	
	    String trackNumber = trackNumImput.getText();
	    String  curRecipientName = recipientNameInput.getText();
	    	
	    Delivery curDelivery = new Delivery(trackNumber, curRecipientName);
	    	
	    curCarrier.scanDelivery(curDelivery);
	    }
	    @FXML
	    void ConfirmAppReturnClick(ActionEvent event) throws Exception {
	    	launchApp.showCarrierMainView();

		}
}

