package application.carrier;

import application.system.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CarrierMainViewController extends Controller{

    @FXML
    private Button btnHome;

    @FXML
    private Button btnNotifyReci;

    @FXML
    private Button btnPackageArrived;

    @FXML
    private Button btnPackageStatus;

    @FXML
    private Button btnReturn;

    @FXML
    private Button btnScanPackage;

    @FXML
    void btnNotifyReciClick(ActionEvent event) {

    }

    @FXML
    void btnPackageArrivedClick(ActionEvent event) {

    }

    @FXML
    void btnPackageStatusClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierChangeStatusView();
    }

    @FXML
    void btnReturnClick(ActionEvent event) throws Exception {
    	launchApp.showCarrLoginView();
    }

    @FXML
    void btnScanPackageClick(ActionEvent event) throws Exception {
    	launchApp.showCarrierAddPacView();
    }

}





