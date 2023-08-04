package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class LaunchAPP extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			Parent root = FXMLLoader.load(getClass().getResource("DeliveryManagementSystem.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Delivery Management System");
			primaryStage.setScene(scene);
			primaryStage.show();	
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
