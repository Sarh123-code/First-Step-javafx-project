package ComboBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunMetric extends Application {
    @Override
    public void start(Stage stage){
        Metric metric = new Metric();

        Scene scene = new Scene(metric, 600, 150);
        stage.setScene(scene);
        stage.setTitle("Metric /Imperial converter");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
