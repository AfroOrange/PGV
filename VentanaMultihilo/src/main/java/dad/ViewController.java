package dad;

import javafx.beans.Observable;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    private final TareasController tareasController = new TareasController();

    @FXML
    private Label mensajeLabel;

    @FXML
    private VBox emptyBox;

    @FXML
    private BorderPane root;

    @FXML
    private Button botonMultihilo;

    public ViewController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public BorderPane getRoot() {
        return root;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onMultithreadAction(ActionEvent event) {

        Stage newStage = new Stage();
        newStage.setTitle("Actividades Diarias");


        // Create a new BorderPane as the root of the new window
        BorderPane newRoot = new BorderPane();

        // Define the tasks
        TareaDiaria primeraTarea = new TareaDiaria("Preparar el desayuno");
        TareaDiaria segundaTarea = new TareaDiaria("Hacer ejercicio");
        TareaDiaria terceraTarea = new TareaDiaria("Leer un libro");

        // Create threads for each task
        Thread hilo1 = new Thread(primeraTarea);
        Thread hilo2 = new Thread(segundaTarea);
        Thread hilo3 = new Thread(terceraTarea);

        // Start the tasks
        System.out.println("Se inician las tareas");
        hilo1.start();
        hilo2.start();
        hilo3.start();

        // Optionally: add UI components to indicate the tasks' status
        Label statusLabel = new Label("Las tareas han comenzado.");
        newRoot.setCenter(statusLabel);

        // Create a Scene and set it to the Stage
        Scene newScene = new Scene(newRoot, 400, 300);
        newStage.setScene(newScene);

        // Show the new window
        newStage.show();
    }
}