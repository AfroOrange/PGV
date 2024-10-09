package dad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TareasApp extends Application {

    private final ViewController viewController = new ViewController();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage modificarStage = new Stage();
        modificarStage.setTitle("Lista de tareas");
        modificarStage.setScene(new Scene(viewController.getRoot()));
        modificarStage.show();
    }
}
