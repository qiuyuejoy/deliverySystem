package application;

//import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.stage.Stage;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
import javafx.application.Application;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;


//import javafx.application.Application;
//import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.input.DragEvent;
//import javafx.scene.input.Dragboard;
//import javafx.scene.input.TransferMode;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;

public class DragAndDropTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        // Create an ImageView to display the dropped image
        ImageView imageView = new ImageView();
        root.getChildren().add(imageView);

        // Set up drag-and-drop event handlers for the ImageView
        imageView.setOnDragOver(event -> {
            if (event.getGestureSource() != imageView && event.getDragboard().hasImage()) {
                event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
            }
            event.consume();
        });

        imageView.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();
            boolean success = false;
            if (db.hasImage()) {
                Image droppedImage = db.getImage();
                imageView.setImage(droppedImage);
                success = true;
            }
            event.setDropCompleted(success);
            event.consume();
        });

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Drag and Drop Image Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//public class DragAndDropTest extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        Label label = new Label("Drag a file to me.");
//        Label dropped = new Label("");
//        VBox dragTarget = new VBox();
//        dragTarget.getChildren().addAll(label,dropped);
//        dragTarget.setOnDragOver(new EventHandler<DragEvent>() {
//
//            @Override
//            public void handle(DragEvent event) {
//                if (event.getGestureSource() != dragTarget
//                        && event.getDragboard().hasFiles()) {
//                    /* allow for both copying and moving, whatever user chooses */
//                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//                }
//                event.consume();
//            }
//        });
//
//        dragTarget.setOnDragDropped(new EventHandler<DragEvent>() {
//
//            @Override
//            public void handle(DragEvent event) {
//                Dragboard db = event.getDragboard();
//                boolean success = false;
//                if (db.hasFiles()) {
//                    dropped.setText(db.getFiles().toString());
//                    success = true;
//                }
//                /* let the source know whether the string was successfully 
//                 * transferred and used */
//                event.setDropCompleted(success);
//
//                event.consume();
//            }
//        });
//
//
//        StackPane root = new StackPane();
//        root.getChildren().add(dragTarget);
//
//        Scene scene = new Scene(root, 500, 250);
//
//        primaryStage.setTitle("Drag Test");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//}