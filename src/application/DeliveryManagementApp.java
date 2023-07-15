package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Delivery {
    private String trackingNumber;
    private String recipientName;
    private boolean isSigned;

    public Delivery(String trackingNumber, String recipientName) {
        this.trackingNumber = trackingNumber;
        this.recipientName = recipientName;
        this.isSigned = false;
    }

    public void setSigned(boolean signed) {
        this.isSigned = signed;
    }

    public boolean isSigned() {
        return isSigned;
    }

    @Override
    public String toString() {
        return "Tracking Number: " + trackingNumber + ", Recipient: " + recipientName + ", Signed: " + isSigned;
    }

	public String getTrackingNumber() {
		return trackingNumber;
	}
}

class DeliveryManager {
    private Map<String, Delivery> deliveryMap;

    public DeliveryManager() {
        deliveryMap = new HashMap<>();
    }

    public void addDelivery(Delivery delivery) {
        deliveryMap.put(delivery.getTrackingNumber(), delivery);
    }

    public boolean queryDeliveryStatus(String trackingNumber) {
        if (deliveryMap.containsKey(trackingNumber)) {
            Delivery delivery = deliveryMap.get(trackingNumber);
            return delivery.isSigned();
        }
        return false;
    }

    public void updateDeliveryStatus(String trackingNumber, boolean signed) {
        if (deliveryMap.containsKey(trackingNumber)) {
            Delivery delivery = deliveryMap.get(trackingNumber);
            delivery.setSigned(signed);
        }
    }
	
	public Collection<Delivery> getDeliveries() {
	    return deliveryMap.values();
	}
}

public class DeliveryManagementApp extends Application {
    private DeliveryManager deliveryManager;
    private ListView<Delivery> deliveryListView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        deliveryManager = new DeliveryManager();
        deliveryListView = new ListView<>();
        deliveryListView.setPrefWidth(300);
        updateDeliveryListView();

        Button addButton = new Button("Add Delivery");
        addButton.setOnAction(event -> showAddDeliveryDialog());

        Button updateButton = new Button("Update Status");
        updateButton.setOnAction(event -> showUpdateStatusDialog());

        VBox vbox = new VBox(deliveryListView, addButton, updateButton);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Delivery Management App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAddDeliveryDialog() {
        Dialog<Delivery> dialog = new Dialog<>();
        dialog.setTitle("Add Delivery");

        ButtonType addButton = new ButtonType("Add", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(addButton, ButtonType.CANCEL);

        TextField trackingNumberField = new TextField();
        TextField recipientNameField = new TextField();

        GridPane grid = new GridPane();
        grid.add(new Label("Tracking Number:"), 0, 0);
        grid.add(trackingNumberField, 1, 0);
        grid.add(new Label("Recipient Name:"), 0, 1);
        grid.add(recipientNameField, 1, 1);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == addButton) {
                String trackingNumber = trackingNumberField.getText();
                String recipientName = recipientNameField.getText();
                return new Delivery(trackingNumber, recipientName);
            }
            return null;
        });

        dialog.showAndWait().ifPresent(delivery -> {
            deliveryManager.addDelivery(delivery);
            updateDeliveryListView();
        });
    }

    private void showUpdateStatusDialog() {
        Delivery selectedDelivery = deliveryListView.getSelectionModel().getSelectedItem();
        if (selectedDelivery != null) {
            Dialog<Boolean> dialog = new Dialog<>();
            dialog.setTitle("Update Status");

            ButtonType updateButton = new ButtonType("Update", ButtonBar.ButtonData.OK_DONE);
            dialog.getDialogPane().getButtonTypes().addAll(updateButton, ButtonType.CANCEL);

            CheckBox signedCheckBox = new CheckBox("Signed");
            signedCheckBox.setSelected(selectedDelivery.isSigned());

            dialog.getDialogPane().setContent(signedCheckBox);

            dialog.setResultConverter(dialogButton -> dialogButton == updateButton);

            dialog.showAndWait().ifPresent(signed -> {
                selectedDelivery.setSigned(signed);
                updateDeliveryListView();
            });
        }
    }

    private void updateDeliveryListView() {
        ObservableList<Delivery> deliveryList = FXCollections.observableArrayList(deliveryManager.getDeliveries());
        deliveryListView.setItems(deliveryList);
    }
}

