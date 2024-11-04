package hu.unideb.inf.SpringJavaFX.frontend;

import hu.unideb.inf.SpringJavaFX.SpringJavaFxApplication;
import hu.unideb.inf.SpringJavaFX.SpringManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFXApp extends Application {

    static Manager manager = new SpringManager();

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader
                .load(getClass().getResource("/fxml/MainFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

        manager.start();
        System.out.println("javaFX -> " + manager.getPersonName());
    }

    @Override
    public void stop() throws Exception {
        manager.stop();
        super.stop();
    }
}
