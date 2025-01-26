package Ramp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RampRun extends Application {
    @Override
    public void start(Stage stage){
        RampUp rampUp = new RampUp(5);

        Scene scene = new Scene(rampUp, 500, 90);
        stage.setScene(scene);
        stage.setTitle("Ramp Up!");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
