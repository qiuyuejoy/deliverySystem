package application.carrier;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CarrierMainViewController extends Controller{

	@FXML
	private Button btnArrived;
	
    @FXML
    private Button btnAddPackage;
    

    @FXML
    void btnAddPackageClick(ActionEvent event) throws Exception {
    	
//    	launchApp.showAddPacView();
    }
    
	@FXML
	void btnArrivedClick(ActionEvent event) throws Exception {
//    	launchApp.showCarrierArrivedView();

	}

}




