package application.system;

import application.LaunchAPP;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public abstract class Controller {
	
	protected LaunchAPP launchApp;

	public LaunchAPP getLaunchApp() {
		return launchApp;
	}

	public void setLaunchApp(LaunchAPP launchApp) {
		this.launchApp = launchApp;
	}
	
	@FXML
    void btnHomeClick(ActionEvent event) throws Exception {
    	launchApp.showMainView();
    }

}
