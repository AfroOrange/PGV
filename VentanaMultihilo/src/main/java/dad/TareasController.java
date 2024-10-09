package dad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TareasController implements Initializable {

    @FXML
    private ScrollPane root;

    public TareasController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TareasView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ScrollPane getRoot() {
        return root;
    }
}
