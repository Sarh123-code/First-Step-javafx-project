package Boite;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chatgpt extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Labels pour les positions du BorderPane
        Label topLabel = new Label("Top");
        Label bottomLabel = new Label("Bottom");
        Label leftLabel = new Label("Left");
        Label rightLabel = new Label("Right");
        Label centerLabel = new Label("Center");

        // Mise en forme des labels
        topLabel.setStyle("-fx-border-color: black; -fx-padding: 10; -fx-alignment: center;");
        bottomLabel.setStyle("-fx-border-color: black; -fx-padding: 10; -fx-alignment: center;");
        leftLabel.setStyle("-fx-border-color: black; -fx-padding: 10;");
        rightLabel.setStyle("-fx-border-color: black; -fx-padding: 10;");
        centerLabel.setStyle("-fx-border-color: black; -fx-padding: 20;");

        // VBox pour l'affichage vertical des labels
        VBox centerBox = new VBox(centerLabel);
        centerBox.setStyle("-fx-alignment: center;");

        // Ajout des éléments au BorderPane
        root.setTop(topLabel);
        root.setBottom(bottomLabel);
        root.setLeft(leftLabel);
        root.setRight(rightLabel);
        root.setCenter(centerBox);

        // Création de la scène
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

