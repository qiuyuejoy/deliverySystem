package application;

import application.forget.*;
import application.model.*;
import application.login.*;
import application.regist.*;
import application.carrier.*;
import application.recipient.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class LaunchAPP extends Application {
	
	private Stage stage;
	private Scene scene;
	private Carrier carrier;
	private Recipient recipient;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		stage = primaryStage;
		showLoginView();
		primaryStage.show();		
	}
	
	public void showLoginView() throws Exception {
		stage.setTitle("Delivery Management System");
		stage.getIcons().clear();
		LoginViewController lgController = (LoginViewController)replaceSceneContent("login/LoginView.fxml");
		lgController.setLaunchApp(this);
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
		ForgetViewController fgController = (ForgetViewController)replaceSceneContent("forget/ForgetView.fxml");
		fgController.setLaunchApp(this);
	}
	
	public void showResetPasswdView() throws Exception {
		stage.setTitle("Reset Password");
		stage.getIcons().clear();
		ResetPasswdViewController rpController = (ResetPasswdViewController)replaceSceneContent("forget/ResetPasswdView.fxml");
		rpController.setLaunchApp(this);
}
	
	public void showRegistView() throws Exception {
		stage.setTitle("Regist");
		stage.getIcons().clear();
		RegistViewController regController = (RegistViewController)replaceSceneContent("regist/RegistView.fxml");
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
	
	private Object replaceSceneContent(String fxmlFile) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(fxmlFile));
		AnchorPane ap = (AnchorPane)loader.load();

		scene = new Scene(ap);
		stage.setScene(scene);
		stage.setResizable(false);
		
		return loader.getController();
	}

	
	public Scene getScene() {
		return scene;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	public Carrier getCarrier() {
		return carrier;
	}
	
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
	
	public Recipient getRecipient() {
		return recipient;
	}
	
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
