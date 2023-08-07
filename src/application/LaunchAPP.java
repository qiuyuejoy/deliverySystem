package application;

import application.login.*;
import application.carrier.*;
import application.recipient.*;
import application.tools.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class LaunchAPP extends Application {
	
	private Stage stage;
	private Scene scene;
	private Database database;

	@Override
	public void start(Stage primaryStage) throws Exception{
		stage = primaryStage;
		database = new Database();
		showMainView();
		primaryStage.show();		
	}
	
	public Database getDatabase() {
		return database;
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	public void showMainView() throws Exception {
		stage.setTitle("Delivery Management System");
		stage.getIcons().clear();
		MainViewController mainController = (MainViewController)replaceSceneContent("login/MainView.fxml");
		mainController.setLaunchApp(this);
	}
	
	public void showCarrLoginView() throws Exception {
		stage.setTitle("Carrier Login");
		stage.getIcons().clear();
		CarrLoginViewController carrlgController = (CarrLoginViewController)replaceSceneContent("login/CarrLoginView.fxml");
		carrlgController.setLaunchApp(this);
	}
	
	public void showReciLoginView() throws Exception {
		stage.setTitle("Recipient Login");
		stage.getIcons().clear();
		ReciLoginViewController recilgController = (ReciLoginViewController)replaceSceneContent("login/ReciLoginView.fxml");
		recilgController.setLaunchApp(this);
	}
	
	public void showForgetView() throws Exception {
		stage.setTitle("Forget Password");
		ForgetViewController fgController = (ForgetViewController)replaceSceneContent("login/ForgetView.fxml");
		fgController.setLaunchApp(this);
	}
	
	public void showResetPasswdView() throws Exception {
		stage.setTitle("Reset Password");
		stage.getIcons().clear();
		ResetPasswdViewController rpController = (ResetPasswdViewController)replaceSceneContent("login/ResetPasswdView.fxml");
		rpController.setLaunchApp(this);
}
	
	public void showRegistView() throws Exception {
		stage.setTitle("Regist");
		stage.getIcons().clear();
		RegistViewController regController = (RegistViewController)replaceSceneContent("login/RegistView.fxml");
		regController.setLaunchApp(this);
	}
	
	public void showCarrierMainView() throws Exception {
		stage.setTitle("Carrier Main View");
		CarrierMainViewController carrierController = (CarrierMainViewController)replaceSceneContent("carrier/CarrierMainView.fxml");
		carrierController.setLaunchApp(this);
	}
	
	public void showRecipientMainView() throws Exception {
		stage.setTitle("Recipient Main View");
		RecipientMainViewController recipientController = (RecipientMainViewController)replaceSceneContent("recipient/RecipientMainView.fxml");
		recipientController.setLaunchApp(this);
	}
	

	public void showPackageStatus() throws Exception {
		stage.setTitle("Package Status Check");
		PackageStatusController pacStatusController = (PackageStatusController) replaceSceneContent("recipient/PackageStatus.fxml");
		pacStatusController.setLaunchApp(this);
	}
	
	private Object replaceSceneContent(String fxmlFile) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(fxmlFile));
		AnchorPane ap = (AnchorPane)loader.load();

		scene = new Scene(ap);
		stage.setScene(scene);
		stage.setResizable(false);
		
		return loader.getController();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
