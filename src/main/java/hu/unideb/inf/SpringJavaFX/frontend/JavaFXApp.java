package hu.unideb.inf.SpringJavaFX.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader
                .load(getClass().getResource("/fxml/MainFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
