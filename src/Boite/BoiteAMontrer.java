package Boite;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BoiteAMontrer extends Application {
    @Override
    public void start(Stage primaryStage) {
        BoiteFabric boite = new BoiteFabric();

        primaryStage.setTitle("Boite à Montrer");
        Scene scene = new Scene(boite, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
