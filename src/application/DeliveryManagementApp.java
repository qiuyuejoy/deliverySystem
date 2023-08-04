package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;


public class DeliveryManagementApp extends Application {
    private Carrier carrier;
//    private Recipient recipient;
	private DeliveryPool deliveryPool;
    private ListView<Delivery> deliveryListView;

    public static void main(String[] args) {
    	Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	
    	deliveryPool = new DeliveryPool();
    	carrier = new Carrier("Tom", 666888, 5, deliveryPool);
        deliveryListView = new ListView<Delivery>();
        deliveryListView.setPrefWidth(800);
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
        Dialog<Delivery> dialog = new Dialog<Delivery>();
        dialog.setTitle("Add Delivery");

        ButtonType addButton = new ButtonType("Add", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(addButton, ButtonType.CANCEL);

        TextField trackingNumberField = new TextField();
        TextField recipientNameField = new TextField();

        GridPane grid = new GridPane();
        grid.add(new Label("Tracking Number: "), 0, 0);
        grid.add(trackingNumberField, 1, 0);
        grid.add(new Label("Recipient Name: "), 0, 1);
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
        	carrier.scanDelivery(delivery);
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
        ObservableList<Delivery> deliveryList = FXCollections.observableArrayList(deliveryPool.getDeliveryMap().values());
        deliveryListView.setItems(deliveryList);
    }
}

