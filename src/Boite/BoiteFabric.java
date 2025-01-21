package Boite;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class BoiteFabric extends BorderPane {
    public BoiteFabric() {
        super();

        this.fabric();
    }

    private void fabric(){
        Label north = new Label("NORTH");
        Label south = new Label("SOUTH");
        Label center = new Label("CENTER");

        // VBox pour l'affichage vertical des labels
        String eastText = "EAST";
        VBox verticalBox = new VBox();
        verticalBox.setStyle("-fx-alignment: center; -fx-border-color: black;");
        verticalBox.setMaxHeight(Double.MAX_VALUE);

        for (char c : eastText.toCharArray()) {
            Label letterLabel = new Label(String.valueOf(c));
            letterLabel.setStyle("-fx-border-color: black;");
            letterLabel.setMaxWidth(Double.MAX_VALUE);
            verticalBox.getChildren().add(letterLabel);
        }

        String westText = "WEST";
        VBox verticalBoxTwo = new VBox();
        verticalBoxTwo.setStyle("-fx-alignment: center; -fx-border-color: black");
        verticalBoxTwo.setMaxHeight(Double.MAX_VALUE);

        for (char c : westText.toCharArray()) {
            Label letterLabel = new Label(String.valueOf(c));
            letterLabel.setStyle("-fx-border-color: black;");
            letterLabel.setMaxWidth(Double.MAX_VALUE);
            verticalBoxTwo.getChildren().add(letterLabel);
        }

        this.setTop(north);
        this.setBottom(south);
        this.setCenter(center);
        this.setRight(verticalBox);
        this.setLeft(verticalBoxTwo);

        // Mise en forme des labels
        north.setStyle("-fx-border-color: black; -fx-alignment: center;");
        north.setMaxWidth(Double.MAX_VALUE);

        south.setStyle("-fx-border-color: black; -fx-alignment: center;");
        south.setMaxWidth(Double.MAX_VALUE);

        center.setStyle("-fx-border-color: black; -fx-alignment: center;");
        center.setMaxWidth(Double.MAX_VALUE);
        center.setMaxHeight(Double.MAX_VALUE);
    }
}
