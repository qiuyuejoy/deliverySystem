package application.system;

import application.LaunchAPP;

public abstract class Controller {
	
	protected LaunchAPP launchApp;

	public LaunchAPP getLaunchApp() {
		return launchApp;
	}

	public void setLaunchApp(LaunchAPP launchApp) {
		this.launchApp = launchApp;
	}
}
