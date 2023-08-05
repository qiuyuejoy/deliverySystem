package application;

//import application.forget.*;
import application.model.*;
import application.login.*;
//import application.regist.*;

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
	
	// show login view
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
	
	// show forget view
//	public void showForgetView() {
//		try {
//			stage.setTitle("Forget");
//			ForgetViewController fgController = (ForgetViewController)replaceSceneContent("forget/ForgetView.fxml");
//			fgController.setLaunchApp(this);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	// show reset password view
//	public void showResetPasswdView() {
//		try {
//			stage.setTitle("ResetPasswdView");
//			ResetPasswdViewController rpController = (ResetPasswdViewController)replaceSceneContent("forget/ResetPasswdView.fxml");
//			rpController.setLaunchApp(this);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	// show registration view
//	public void showRegistView() {
//		try {
//			stage.setTitle("Regist");
//			stage.getIcons().add(new Image("file:images/regist.png"));
//			
//			FXMLLoader loader = new FXMLLoader();
//			loader.setLocation(LunchApp.class.getResource("regist/RegistView.fxml"));
//			BorderPane bp = (BorderPane)loader.load();
//			scene = new Scene(bp);
//			stage.setScene(scene);
//			stage.setResizable(false);
//			
//			RegistViewController regController = (RegistViewController)loader.getController();
//			System.out.println(regController);
//			regController.setLunchApp(this);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	// replace scene content
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
